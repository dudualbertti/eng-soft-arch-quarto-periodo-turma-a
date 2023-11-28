package com.api.celcoin.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;


public class CelcoinPixDTO {

    private CelcoinMerchantDTO merchant;
    private String key;
    private Double amount;

    @JsonbProperty(value = "transactionIdentification")
    private String transactionId;

    public CelcoinMerchantDTO getMerchant() {
        return merchant;
    }

    public void setMerchant(CelcoinMerchantDTO merchant) {
        this.merchant = merchant;
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

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    
}