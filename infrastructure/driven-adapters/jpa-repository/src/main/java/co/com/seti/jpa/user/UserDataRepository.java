package co.com.seti.jpa.user;

import co.com.seti.jpa.user.entities.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;
import java.util.Optional;

public interface UserDataRepository extends CrudRepository<UserEntity, Long>, QueryByExampleExecutor<UserEntity> {

    Boolean existsByIdAndActiveTrue(Long id);
    Boolean existsByEmailAndActiveTrue(String email);
    Optional<UserEntity> findByEmailAndActiveTrue(String email);

}
