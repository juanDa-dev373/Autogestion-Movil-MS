package co.com.seti.jpa.user;

import co.com.seti.jpa.helper.AdapterOperations;
import co.com.seti.jpa.user.entities.UserEntity;
import co.com.seti.model.user.User;
import co.com.seti.model.user.gateway.UserGateway;
import lombok.extern.slf4j.Slf4j;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class UserGatewayAdapter extends AdapterOperations<User, UserEntity, Long, UserDataRepository>
        implements UserGateway {

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public UserGatewayAdapter(UserDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, User.class));
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsByIdAndActiveTrue(id);
    }

    @Override
    public User validatePassword(String email, String password) {
        log.info("Validando contraseña para el usuario con email: {}", email);

        return repository.findByEmailAndActiveTrue(email)
                .map(user -> {
                    if (!passwordEncoder.matches(password, user.getPassword())) {
                        log.warn("Contraseña incorrecta para el usuario con email: {}", email);
                        throw new IllegalArgumentException("La contraseña es incorrecta.");
                    }
                    return toEntity(user);
                })
                .orElseThrow(() -> {
                    log.error("Usuario con email {} no encontrado.", email);
                    return new IllegalArgumentException("El usuario con el email " + email + " no existe.");
                });
    }

    @Override
    public boolean existByEmail(String email) {
        return repository.existsByEmailAndActiveTrue(email);
    }
}
