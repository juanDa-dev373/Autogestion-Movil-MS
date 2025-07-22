package co.api.couch.jpa.plan;

import co.api.couch.jpa.plan.entities.PlanEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface PlanDataRepository extends CrudRepository<PlanEntity, Integer>, QueryByExampleExecutor<PlanEntity> {
}
