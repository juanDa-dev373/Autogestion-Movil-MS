package co.api.couch.usecase.stats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Mono;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ValidateHashUseCaseTest {

//    @InjectMocks
//    private ValidateHashUseCase validateHashUseCase;
//
//    @BeforeEach
//    public void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void validateHashWhenHashIsInvalid() {
//
//        Stats stats = Stats.builder()
//                .totalContactoClientes(250)
//                .motivoReclamo(25)
//                .motivoGarantia(10)
//                .motivoDuda(100)
//                .motivoCompra(100)
//                .motivoFelicitaciones(7)
//                .motivoCambio(8)
//                .hash("fbd26d82e4a06fc574ea506492adefaf")
//                .build();
//
//        Mono<Boolean> validate = validateHashUseCase.validateHash(stats);
//        assertEquals(Boolean.FALSE, validate.block());
//    }
//    @Test
//    void validateHashWhenHashIsValid() {
//
//        Stats stats = Stats.builder()
//                .totalContactoClientes(250)
//                .motivoReclamo(25)
//                .motivoGarantia(10)
//                .motivoDuda(100)
//                .motivoCompra(100)
//                .motivoFelicitaciones(7)
//                .motivoCambio(8)
//                .hash("5484062a4be1ce5645eb414663e14f59")
//                .build();
//
//        Mono<Boolean> validate = validateHashUseCase.validateHash(stats);
//        assertEquals(Boolean.TRUE, validate.block());
//    }
//
//    @Test
//    void validateHashWhenHashNull() throws Exception {
//        Stats stats = Stats.builder().build();
//        Method method = ValidateHashUseCase.class.getDeclaredMethod("md5", String.class);
//        method.setAccessible(true);
//        assertThrows(Exception.class, ()-> method.invoke(validateHashUseCase, stats.getHash()));
//    }
}