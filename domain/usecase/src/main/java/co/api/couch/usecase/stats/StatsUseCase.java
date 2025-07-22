package co.api.couch.usecase.stats;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
@Log
@RequiredArgsConstructor
public class StatsUseCase {

//    private final StatsGateway statsGateway;
//    private final ValidateHashUseCase  validateHashUseCase;
//
//    public Mono<Stats> save(Stats stats) {
//        return validateHashUseCase.validateHash(stats).flatMap(valid->{
//           if(valid){
//               log.info("Inicia proceso de guardado en base de datos");
//               return statsGateway.saveStats(stats);
//           }else {
//               log.warning("Los datos no son validos");
//               return Mono.error(new ValidationException("Los datos ingresados no coinciden con el hash", 400));
//           }
//        });
//    }

}
