package co.api.couch.jpa.helper;

class DynamoDBStatsAdapterTest {

//    @Mock
//    private DynamoDbEnhancedAsyncClient enhancedClient;
//
//    @Mock
//    private ObjectMapper mapper;
//
//    @Mock
//    private DynamoDbAsyncTable<StatsEntity> statsTable;
//
//    private StatsEntity statsEntity;
//    private Stats statsDomain;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//
//        when(enhancedClient.table("stats_table", TableSchema.fromBean(StatsEntity.class)))
//                .thenReturn(statsTable);
//
//        statsEntity = new StatsEntity();
//        statsEntity.setHash("hash123");
//        statsEntity.setTotalContactoClientes(250);
//        statsEntity.setMotivoReclamo(25);
//        statsEntity.setMotivoGarantia(10);
//        statsEntity.setMotivoDuda(100);
//        statsEntity.setMotivoCompra(100);
//        statsEntity.setMotivoFelicitaciones(7);
//        statsEntity.setMotivoCambio(8);
//
//        statsDomain = new Stats(250, 25, 10, 100, 100, 7, 8, "hash123");
//    }
//
//    @Test
//    void saveStats_shouldReturnSavedObject() {
//        when(mapper.map(statsDomain, StatsEntity.class)).thenReturn(statsEntity);
//        when(statsTable.putItem(statsEntity)).thenReturn(CompletableFuture.completedFuture(null));
//        when(mapper.map(statsEntity, Stats.class)).thenReturn(statsDomain);
//
//        DynamoDBStatsAdapter adapter = new DynamoDBStatsAdapter(enhancedClient, mapper);
//
//        StepVerifier.create(adapter.saveStats(statsDomain))
//                .expectNext(statsDomain)
//                .verifyComplete();
//    }
//
//    @Test
//    void statsEntityFields_shouldMatchDomain() {
//        assertEquals(250, statsEntity.getTotalContactoClientes());
//        assertEquals(25, statsEntity.getMotivoReclamo());
//        assertEquals(10, statsEntity.getMotivoGarantia());
//        assertEquals(100, statsEntity.getMotivoDuda());
//        assertEquals(100, statsEntity.getMotivoCompra());
//        assertEquals(7, statsEntity.getMotivoFelicitaciones());
//        assertEquals(8, statsEntity.getMotivoCambio());
//        assertEquals("hash123", statsEntity.getHash());
//    }
}
