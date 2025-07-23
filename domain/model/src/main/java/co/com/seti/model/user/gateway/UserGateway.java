package co.com.seti.model.user.gateway;


import co.com.seti.model.user.User;

public interface UserGateway {
    User findById(Long id);

    boolean existsById(Long id);

    User validatePassword(String email, String password);

    boolean existByEmail(String email);
}
