package co.com.seti.jpa.plan;

import co.com.seti.jpa.helper.AdapterOperations;

import co.com.seti.jpa.plan.entities.PlanEntity;
import co.com.seti.model.plan.Plan;
import co.com.seti.model.plan.gateway.PlanGateway;
import lombok.extern.slf4j.Slf4j;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class PlanGatewayAdapter extends AdapterOperations<Plan, PlanEntity, Long, PlanDataRepository>
        implements PlanGateway {

    public PlanGatewayAdapter(PlanDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Plan.class));
    }

    @Override
    public Plan findByIdUser(Long idUser) {
        return  toEntity(repository.findPlanByUserId(idUser));
    }
}