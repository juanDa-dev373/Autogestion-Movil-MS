package co.com.seti.jpa.bill;

import co.com.seti.jpa.bill.entities.BillEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.time.LocalDate;
import java.util.List;

public interface BillDataRepository extends CrudRepository<BillEntity, Long>, QueryByExampleExecutor<BillEntity> {
    @Query(
            value = "SELECT * FROM bills WHERE user_id = :userId AND created_at BETWEEN :startDate AND :endDate ORDER BY created_at DESC",
            nativeQuery = true
    )
    List<BillEntity> findByUserIdAndDate(@Param("userId") Long userId,
                                         @Param("startDate") LocalDate startDate,
                                         @Param("endDate") LocalDate endDate);
}
