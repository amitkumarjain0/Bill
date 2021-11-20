package com.example.untitled.service;

import com.example.untitled.entity.Bill;
import com.example.untitled.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BillService {

    @Autowired
    BillRepository billRepository;


    public Bill addBill(Bill bill){
        billRepository.save(bill);
        return bill;
    }

    public List<Bill> getAllBills(){
        return billRepository.findAllBill();
    }

    public List<Bill> getBillById(Long id){
        return billRepository.findBillById(id);
    }

    public List<Bill> getBillByDueDate(Date date){
        return billRepository.findBillByDueDate(date);
    }

}
