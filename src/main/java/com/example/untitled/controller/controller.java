package com.example.untitled.controller;

import com.example.untitled.entity.Bill;
import com.example.untitled.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;
import java.util.List;

@RestController
@EnableSwagger2
public class controller {

    @Autowired
    BillService billService;

    @PostMapping(value="/add")
    public Bill addBill(@RequestBody Bill bill){
        return billService.addBill(bill);
    }

    @GetMapping(value = "/bill")
    public List<Bill> getBill() {
        return billService.getAllBills();
    }
    @GetMapping(value = "/bill/{id}")
    public List<Bill> getBillById(@PathVariable Long id) {
        return billService.getBillById(id);

    }
    @GetMapping(value = "/bill/due/{date}")
    public List<Bill> getBillById(@PathVariable @DateTimeFormat(pattern = "dd-MM-yy") Date date) {
        return billService.getBillByDueDate(date);
    }
}
