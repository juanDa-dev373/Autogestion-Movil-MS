package co.api.couch.usecase.stats.auth;

import co.api.couch.model.common.exception.CodeError;
import co.api.couch.model.common.exception.ErrorException;
import co.api.couch.model.common.jwt.JwtUtilGateway;
import co.api.couch.model.user.User;
import co.api.couch.model.user.gateway.UserGateway;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class AuthUseCase {
    private final UserGateway  userGateway;
    private final JwtUtilGateway jwtUtil;

    public String login(String email, String password) throws Exception {
        boolean existingUser = this.userGateway.existByEmail(email);

        if (!existingUser)
            throw new ErrorException("El usuario no fue encontrado", CodeError.NOT_FOUND.getCode());

        User usuario = this.userGateway.validatePassword(email, password);

        Map<String, Object> map = new HashMap<>();

        map.put("id", usuario.getId());

        return jwtUtil.generateToken(usuario.getEmail(), map);
    }

}
