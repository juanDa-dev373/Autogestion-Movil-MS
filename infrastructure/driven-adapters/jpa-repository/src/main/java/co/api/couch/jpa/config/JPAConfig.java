package co.api.couch.jpa.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class JPAConfig {

    @Bean
    public DBSecret dbSecret(
            @Value("${spring.datasource.hikari.jdbc-url}") String url,
            @Value("${spring.datasource.username}") String username,
            @Value("${spring.datasource.password}") String password
    ) {
        return DBSecret.builder()
                .url(url)
                .username(username)
                .password(password)
                .build();
    }

    @Bean
    public DataSource datasource(DBSecret secret, @Value("${spring.datasource.driverClassName}") String driverClass) {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(secret.getUrl());
        config.setUsername(secret.getUsername());
        config.setPassword(secret.getPassword());
        config.setDriverClassName(driverClass);
        return new HikariDataSource(config);
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
            DataSource dataSource,
            @Value("${spring.jpa.databasePlatform}") String dialect,
            @Value("${spring.jpa.hibernate.ddl-auto}") String ddlauto) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan("co.api.couch.jpa");

        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);

        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", dialect);
        properties.setProperty("hibernate.hbm2ddl.auto", ddlauto);

        em.setJpaProperties(properties);
        return em;
    }
}
