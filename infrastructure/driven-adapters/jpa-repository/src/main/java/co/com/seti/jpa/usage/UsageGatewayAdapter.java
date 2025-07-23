package co.com.seti.jpa.usage;

import co.com.seti.jpa.helper.AdapterOperations;
import co.com.seti.jpa.usage.entities.UsageEntity;
import co.com.seti.model.usage.gateway.UsageGateway;
import co.com.seti.model.usage.Usage;
import lombok.extern.slf4j.Slf4j;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class UsageGatewayAdapter extends AdapterOperations<Usage, UsageEntity, Long, UsageDataRepository>
        implements UsageGateway {

    public UsageGatewayAdapter(UsageDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Usage.class));
    }

    @Override
    public Usage findByIdUser(Long idUser) {
        return toEntity(repository.findPlanByUserId(idUser));
    }
}