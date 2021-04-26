package com.example.micro1.controller;

import com.example.micro1.dao.InvoiceDAO;
import com.example.micro1.model.Invoice;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllInvoices {

    @Autowired
    private InvoiceDAO invoiceDAO;

    @GetMapping("/micro1/getAllInvoices")
    public String getAllInvoices(){
        List<Invoice> all = invoiceDAO.findAll();
        Gson gson = new Gson();
        String json = gson.toJson(all);
        return json;
    }
}
