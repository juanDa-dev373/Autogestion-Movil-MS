package co.com.seti.jpa.plan;


import co.com.seti.jpa.plan.entities.PlanEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface PlanDataRepository extends CrudRepository<PlanEntity, Long>, QueryByExampleExecutor<PlanEntity> {
    @Query(value = """
        SELECT p FROM PlanEntity p JOIN UserEntity u On p.id = u.planId WHERE u.id = :id
        """)
    PlanEntity findPlanByUserId(@Param("id") Long idUser);
}
