package co.api.couch.jpa.bill;

import co.api.couch.jpa.bill.entities.BillEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface BillDataRepository extends CrudRepository<BillEntity, Integer>, QueryByExampleExecutor<BillEntity> {
}
