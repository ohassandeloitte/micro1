package com.example.micro1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String reference;
    private String details;

    public Invoice() {}

    public Invoice(String reference, String details) {
        this.reference = reference;
        this.details = details;
    }

    @Override
    public String toString() {
        return String.format(
                "Invoice[id=%d, firstName='%s', lastName='%s']",
                id, reference, details);
    }

    public Long getId() {
        return id;
    }

    public String getReference() {
        return reference;
    }

    public String getDetails() {
        return details;
    }
}