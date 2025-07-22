package co.api.couch.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "TICKET API",
                version = "1.0.0",
                description = "API para la gestión de tickets."
        )
)
public class SwaggerConfig {
}
