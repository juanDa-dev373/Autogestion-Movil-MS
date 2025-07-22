package co.api.couch.usecase.stats.auth;

import co.api.couch.model.user.gateway.UserGateway;
import lombok.RequiredArgsConstructor;

import java.util.logging.Logger;

@RequiredArgsConstructor
public class AuthUseCase {
    private static final Logger logger = Logger.getLogger(AuthUseCase.class.getName());
    private final UserGateway  userGateway;

    public void loggin(){

    }

}
