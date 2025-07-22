package co.api.couch.jpa.usage;

import co.api.couch.jpa.usage.entities.UsageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface UsageDataRepository extends CrudRepository<UsageEntity, Long>, QueryByExampleExecutor<UsageEntity> {
}
