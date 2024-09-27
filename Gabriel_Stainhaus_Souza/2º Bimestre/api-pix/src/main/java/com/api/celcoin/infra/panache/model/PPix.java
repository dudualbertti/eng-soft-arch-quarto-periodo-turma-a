package com.api.celcoin.infra.panache.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;


@Entity
@Table(name = "GABRIEL_PIX_CELCOIN")
public class PPix extends PanacheEntityBase {

    @Id
    @Column(name = "ID")
    private UUID id;

    @Column(name = "TRANSACTION_ID")
    private Long transactionId;

    @Column(name = "EMV")
    private String emvqrcps;

    @Column(name = "KEY")
    private String key;

    @Column(name = "AMOUNT")
    private Double amount;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getEmvqrcps() {
        return emvqrcps;
    }

    public void setEmvqrcps(String emvqrcps) {
        this.emvqrcps = emvqrcps;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
