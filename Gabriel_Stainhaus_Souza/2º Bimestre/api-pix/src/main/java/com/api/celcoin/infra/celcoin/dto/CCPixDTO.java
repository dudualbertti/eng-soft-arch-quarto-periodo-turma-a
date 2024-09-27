package com.api.celcoin.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CCPixDTO {
    private String key;
    private Double amount;
    private CCMerchantDTO merchant;

    @JsonbProperty(value = "transactionIdentification")
    private String transactionId;

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

    public CCMerchantDTO getMerchant() {
        return merchant;
    }

    public void setMerchant(CCMerchantDTO merchant) {
        this.merchant = merchant;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
