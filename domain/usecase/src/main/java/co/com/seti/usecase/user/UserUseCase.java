package co.com.seti.usecase.user;

import co.com.seti.model.common.exception.CodeError;
import co.com.seti.model.common.exception.ErrorException;
import co.com.seti.model.plan.Plan;
import co.com.seti.model.plan.gateway.PlanGateway;
import co.com.seti.model.usage.Usage;
import co.com.seti.model.usage.gateway.UsageGateway;
import co.com.seti.model.usage.response.UsageResponse;
import co.com.seti.model.user.User;
import co.com.seti.model.user.gateway.UserGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import static java.util.Objects.isNull;

@Slf4j
@RequiredArgsConstructor
public class UserUseCase {

    private final UserGateway userGateway;
    private final PlanGateway planGateway;
    private final UsageGateway usageGateway;

    public User findUserById(Long id) throws ErrorException {
        log.info("Buscando usuario con ID: {}", id);

        if (!userGateway.existsById(id)) {
            log.warn("Usuario no encontrado con ID: {}", id);
            throw new ErrorException("El usuario con el id " + id + " no existe.", CodeError.NOT_FOUND.getCode());
        }

        return userGateway.findById(id);
    }

    public Plan findPlanByIdUser(Long id) throws ErrorException {
        log.info("Buscando plan con ID usuario: {}", id);
        Plan plan = planGateway.findByIdUser(id);
        if (isNull(plan)) {
            log.warn("Plan no encontrado con ID de usuario: {}", id);
            throw new ErrorException("El usuario con el id " + id + " no tiene plan.", CodeError.NOT_FOUND.getCode());
        }

        return planGateway.findByIdUser(id);
    }

    public UsageResponse findUsageByIdUser(Long id) throws ErrorException {
        log.info("Buscando usage con ID usuario: {}", id);
        Usage usage = usageGateway.findByIdUser(id);
        if (isNull(usage)) {
            log.warn("Consumo no encontrado con ID de usuario: {}", id);
            throw new ErrorException("El usuario con el id " + id + " no tiene consumo.", CodeError.NOT_FOUND.getCode());
        }
        Plan plan = planGateway.findByIdUser(id);
        if (isNull(plan)) {
            log.warn("Plan no encontrado con ID de usuario: {}", id);
            throw new ErrorException("El usuario con el id " + id + " no tiene plan.", CodeError.NOT_FOUND.getCode());
        }

        return UsageResponse.builder()
                .userId(id)
                .dataTotalGb(plan.getDataGb())
                .dataUsedGb(usage.getDataGb())
                .minutesTotal(plan.getMinutes())
                .minutesUsed(usage.getMinutes())
                .smsTotal(plan.getSms())
                .smsUsed(usage.getSms())
                .build();
    }

}
