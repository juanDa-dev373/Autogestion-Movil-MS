package co.api.couch.model.user.gateway;

import co.api.couch.model.user.User;

public interface UserGateway {
    User save(User user);

    User findById(Integer id);

    User validatePassword(String email, String password);

    boolean existByEmail(String email);
}
