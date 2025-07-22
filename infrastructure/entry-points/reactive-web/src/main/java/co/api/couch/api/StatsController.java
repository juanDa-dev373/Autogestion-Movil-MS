package co.api.couch.api;

import co.api.couch.usecase.stats.StatsUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Log
@Component
@RequiredArgsConstructor
public class StatsController {

    private final StatsUseCase  statsUseCase;

    public Mono<ServerResponse> listenPOSTUseCase(ServerRequest serverRequest) {
        return ServerResponse.ok().build();
    }
}
