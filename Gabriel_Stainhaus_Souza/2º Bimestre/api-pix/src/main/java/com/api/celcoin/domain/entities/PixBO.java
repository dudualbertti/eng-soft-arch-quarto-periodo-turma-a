package com.api.celcoin.domain.entities;

import java.util.UUID;

public class PixBO {

    private String qrCode;

    private Double amount;

    private UUID id;

    private Long transactionId;

    private String key;

    public PixBO(UUID id, String key, Double amount, String qrCode, Long transactionId) {
        this.id = id != null ? id : UUID.randomUUID();
        this.key = key;
        this.amount = amount;
        this.qrCode = qrCode;
        this.transactionId = transactionId;
    }

    public String getQrCode() {
        return qrCode;
    }

    public Double getAmount() {
        return amount;
    }

    public UUID getId() {
        return id;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public String getKey() {
        return key;
    }

}
