package co.com.seti.jpa.usage;

import co.com.seti.jpa.usage.entities.UsageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface UsageDataRepository extends CrudRepository<UsageEntity, Long>, QueryByExampleExecutor<UsageEntity> {
    UsageEntity findPlanByUserId(Long idUser);
}
