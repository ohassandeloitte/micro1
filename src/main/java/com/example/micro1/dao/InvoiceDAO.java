package com.example.micro1.dao;

import com.example.micro1.model.Invoice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InvoiceDAO extends CrudRepository<Invoice,Long> {
    List<Invoice> findAll();
}
