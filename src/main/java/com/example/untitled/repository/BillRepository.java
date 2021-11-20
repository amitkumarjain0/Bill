package com.example.untitled.repository;

import com.example.untitled.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface BillRepository extends JpaRepository<Bill,Long> {

    @Query(value = "Select * from bill",nativeQuery = true)
    List<Bill> findAllBill();

    @Query(value = "Select * from bill where bill_number = ?",nativeQuery = true)
    List<Bill> findBillById(Long id);

    @Query(value = "Select * from bill where bill_date = ?",nativeQuery = true)
    List<Bill> findBillByDueDate(Date date);
}
