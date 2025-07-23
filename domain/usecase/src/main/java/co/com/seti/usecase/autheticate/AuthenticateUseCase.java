package co.com.seti.usecase.autheticate;

import co.com.seti.model.common.exception.ErrorException;
import co.com.seti.model.common.exception.CodeError;
import co.com.seti.model.common.jwt.JwtUtilGateway;
import co.com.seti.model.user.User;
import co.com.seti.model.user.gateway.UserGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Slf4j
public class AuthenticateUseCase {

    private final UserGateway userGateway;
    private final JwtUtilGateway jwtUtil;

    public String login(String email, String password) throws Exception {
        log.info("Intentando iniciar sesión con email: {}", email);
        boolean existingUser = this.userGateway.existByEmail(email);

        if (!existingUser) {
            log.warn("Inicio de sesión fallido: Usuario con email {} no encontrado", email);
            throw new ErrorException("El usuario no fue encontrado", CodeError.NOT_FOUND.getCode());
        }

        User user = this.userGateway.validatePassword(email, password);
        log.info("Usuario autenticado con éxito: ID {}", user.getId());

        Map<String, Object> map = new HashMap<>();
        map.put("rol", List.of("CLIENT"));
        map.put("id", user.getId());
        map.put("name", user.getName());

        String token = jwtUtil.generateToken(user.getEmail(), map);
        log.info("Token generado exitosamente para el usuario: {}", user.getEmail());
        return token;
    }
}