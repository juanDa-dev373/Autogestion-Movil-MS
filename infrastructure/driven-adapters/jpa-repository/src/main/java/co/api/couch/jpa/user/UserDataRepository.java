package co.api.couch.jpa.user;

import co.api.couch.jpa.user.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface UserDataRepository extends CrudRepository<UserEntity, Integer>, QueryByExampleExecutor<UserEntity> {
}
