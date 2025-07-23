package co.com.seti.model.bill.gateway;

import co.com.seti.model.bill.Bill;

import java.time.LocalDate;
import java.util.List;

public interface BillGateway {

    List<Bill> findAllBillsByIdUserAndDate(Long idUser, LocalDate startDate, LocalDate endDate);

}
