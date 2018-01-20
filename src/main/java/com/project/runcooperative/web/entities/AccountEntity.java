package com.project.runcooperative.web.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "serial")
    private long id;
    private Date date_created;
    private String AccountNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "holder_id")
    private CustomerEntity Accountholder;

    private double Amount;

    public CustomerEntity getAccountholder() {
        return Accountholder;
    }

    public void setAccountholder(CustomerEntity accountholder) {
        Accountholder = accountholder;
    }

    public String getAccountNumber() {
        return AccountNumber;

    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }
}
