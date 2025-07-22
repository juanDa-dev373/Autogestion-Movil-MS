package co.api.couch.usecase.stats;

public class StatsUseCaseTest {

//    @Mock
//    private StatsGateway ticketRepository;
//
//    private ValidateHashUseCase validateHashUseCase;
//
//    private StatsUseCase statsUseCase;
//
//    @BeforeEach
//    public void setUp() {
//        openMocks(this);
//        validateHashUseCase = new ValidateHashUseCase();
//        statsUseCase = new StatsUseCase(ticketRepository, validateHashUseCase);
//    }
//
//
//    @Test
//    public void  saveSuccess() {
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
//        when(ticketRepository.saveStats(any())).thenReturn(Mono.just(stats));
//        Stats response = statsUseCase.save(stats).block();
//        Assertions.assertNotNull(response);
//    }
//
//    @Test
//    public void  saveError() {
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
//        Assertions.assertThrows(Exception.class, ()-> statsUseCase.save(stats).block());
//    }
}