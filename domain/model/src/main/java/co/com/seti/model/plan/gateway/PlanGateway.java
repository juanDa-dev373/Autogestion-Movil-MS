package co.com.seti.model.plan.gateway;

import co.com.seti.model.plan.Plan;

public interface PlanGateway {
    Plan findByIdUser(Long idUser);
}
