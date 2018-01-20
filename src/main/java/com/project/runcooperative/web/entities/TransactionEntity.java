package com.project.runcooperative.web.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
public class TransactionEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private long id;
    private Date date_created;

    @ManyToOne(targetEntity = AccountEntity.class)
    @JoinColumn(name="debiting_account")
    private AccountEntity debiting_account;

    @ManyToOne(targetEntity = AccountEntity.class)
    @JoinColumn(name="crediting_account")
    private AccountEntity crediting_account;

    private int amount;

    public AccountEntity getDebiting_account() {
        return debiting_account;
    }

    public void setDebiting_account(AccountEntity debiting_account) {
        this.debiting_account = debiting_account;
    }

    public AccountEntity getCrediting_account() {
        return crediting_account;
    }

    public void setCrediting_account(AccountEntity crediting_account) {
        this.crediting_account = crediting_account;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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
}
