package br.fag.api.domain.entities;

import java.util.UUID;

public class PixBO {
    private UUID id;
    private String key;
    private Double amount;
    private String emv;
    private Long transactionId;

    public PixBO(UUID id, String key, Double amount, String emv, Long transactionId) {
        this.id = id != null ? id : UUID.randomUUID();
        this.key = key;
        this.amount = amount;
        this.emv = emv;
        this.transactionId = transactionId;
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

    public String getEmv() {
        return emv;
    }

    public Long getTransactionId() {
        return transactionId;
    }
}
