package com.project.runcooperative.web.entities;


import javax.persistence.*;

@Entity
public class LoanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private long id;

    @OneToOne(targetEntity = LoanTypeEntity.class)
    @JoinColumn(name = "loan_id", nullable = false)
    private LoanTypeEntity loanTypeEntity;


    @OneToOne(targetEntity = LoanTypeEntity.class)
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerEntity customerEntity;

    private double amount;

    private double payback_amount;

    private boolean hasbeen_paid;

    private int duration;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LoanTypeEntity getLoanTypeEntity() {
        return loanTypeEntity;
    }

    public void setLoanTypeEntity(LoanTypeEntity loanTypeEntity) {
        this.loanTypeEntity = loanTypeEntity;
    }

    public CustomerEntity getCustomerEntity() {
        return customerEntity;
    }

    public void setCustomerEntity(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPayback_amount() {
        return payback_amount;
    }

    public void setPayback_amount(double payback_amount) {
        this.payback_amount = payback_amount;
    }

    public boolean isHasbeen_paid() {
        return hasbeen_paid;
    }

    public void setHasbeen_paid(boolean hasbeen_paid) {
        this.hasbeen_paid = hasbeen_paid;
    }
}
