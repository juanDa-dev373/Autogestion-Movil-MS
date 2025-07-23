package co.com.seti.jpa.bill;

import co.com.seti.jpa.bill.entities.BillEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface BillDataRepository extends CrudRepository<BillEntity, Long>, QueryByExampleExecutor<BillEntity> {
}
