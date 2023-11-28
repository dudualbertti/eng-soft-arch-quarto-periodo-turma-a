package com.api.celcoin.domain.entities;

import java.util.UUID;

public class PixBO {

    private String qrCode;
    private Long transactionId;
    private UUID id;
    private String key;
    private Double amount;


    public PixBO(String qrCode, Long transactionId, UUID id, String key, Double amount) {
        this.qrCode = qrCode;
        this.transactionId = transactionId;
        this.id = id;
        this.key = key;
        this.amount = amount;

    }


    public String getQrCode() {
        return qrCode;
    }


    public Long getTransactionId() {
        return transactionId;
    }


    public UUID getId() {
        return id;
    }


    public String getKey() {
        return key;
    }


    public Double getAmount() {
        return amount;
    }

    
}