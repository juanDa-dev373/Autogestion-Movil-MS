package co.api.couch.jpa.user;

import co.api.couch.jpa.helper.AdapterOperations;
import co.api.couch.jpa.user.entities.UserEntity;
import co.api.couch.model.user.User;
import co.api.couch.model.user.gateway.UserGateway;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserGatewayAdapter extends AdapterOperations<User, UserEntity, Integer, UserDataRepository> implements UserGateway {

    public UserGatewayAdapter(UserDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, User.class));
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return repository.findById(id).stream().map(this::toEntity).findFirst().orElse(null);
    }

    @Override
    public User validatePassword(String email, String password) {
        return null;
    }

    @Override
    public boolean existByEmail(String email) {
        return false;
    }
}
