package co.com.seti.jpa.bill;

import co.com.seti.jpa.bill.entities.BillEntity;
import co.com.seti.jpa.helper.AdapterOperations;
import co.com.seti.model.bill.Bill;
import co.com.seti.model.bill.gateway.BillGateway;
import lombok.extern.slf4j.Slf4j;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class BillGatewayAdapter extends AdapterOperations<Bill, BillEntity, Long, BillDataRepository>
        implements BillGateway {

    public BillGatewayAdapter(BillDataRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, Bill.class));
    }
}