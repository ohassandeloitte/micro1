package com.example.micro1.controller;

import com.example.micro1.dao.InvoiceDAO;
import com.example.micro1.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CreateRandomInvoice {

    @Autowired
    private InvoiceDAO invoiceDAO;

    @GetMapping("/micro1/createRandomInvoices")
    public String createRandomInvoices(){

        for(int i = 0 ;  i < 1000 ; i ++){
            Invoice invoice = new Invoice(String.valueOf(i),String.valueOf(i));
            invoiceDAO.save(invoice);
        }
        return "was it ok?.. han't check actually..";

    }

}
