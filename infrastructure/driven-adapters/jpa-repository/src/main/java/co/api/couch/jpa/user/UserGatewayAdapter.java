package co.api.couch.jpa.user;

import co.api.couch.model.user.User;
import co.api.couch.model.user.gateway.UserGateway;
import org.springframework.stereotype.Repository;

@Repository
public class UserGatewayAdapter implements UserGateway {
    @Override
    public User save(User user) {
        return null;
    }
}
