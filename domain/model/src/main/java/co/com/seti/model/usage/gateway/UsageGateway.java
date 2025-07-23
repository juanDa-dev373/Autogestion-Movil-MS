package co.com.seti.model.usage.gateway;

import co.com.seti.model.usage.Usage;

public interface UsageGateway {
    Usage findByIdUser(Long idUser);
}
