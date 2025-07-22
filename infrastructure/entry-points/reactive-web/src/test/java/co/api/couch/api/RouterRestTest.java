package co.api.couch.api;

import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {RouterRest.class, StatsController.class})
@WebFluxTest
class RouterRestTest {

//    @Autowired
//    private WebTestClient webTestClient;
//
//    @MockBean
//    private StatsUseCase statsUseCase;
//
//    @Test
//    void testListenPOSTBadRequest() {
//        Stats stats = new Stats();
//        Mockito.when(statsUseCase.save(stats)).thenReturn(Mono.empty());
//        webTestClient.post()
//                .uri("/api/Stats")
//                .accept(MediaType.APPLICATION_JSON)
//                .bodyValue(stats)
//                .exchange()
//                .expectStatus().isBadRequest()
//                .expectBody(String.class)
//                .value(userResponse -> {
//                            Assertions.assertThat(userResponse).isNotEmpty();
//                        }
//                );
//    }
//
//    @Test
//    void testListenPOSTOk() {
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
//        Mockito.when(statsUseCase.save(Mockito.any(Stats.class))).thenReturn(Mono.just(stats));
//        webTestClient.post()
//                .uri("/api/Stats")
//                .contentType(MediaType.APPLICATION_JSON)
//                .accept(MediaType.APPLICATION_JSON)
//                .bodyValue(stats)
//                .exchange()
//                .expectStatus().isOk()
//                .expectBody(Stats.class)
//                .value(userResponse -> {
//                            Assertions.assertThat(userResponse.getHash()).isEqualTo("5484062a4be1ce5645eb414663e14f59") ;
//                        }
//                );
//    }
}
