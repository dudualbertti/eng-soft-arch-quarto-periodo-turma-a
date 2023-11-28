package com.aktie.infra.celcoin.dto;

import com.aktie.domain.dto.MerchantDTO;

import java.math.BigDecimal;
import java.util.UUID;

public class CelcoinPixDTO {

    private CelcoinPixMerchantDTO merchant;
    private String clientRequestId;
    private String status;
    private long transactionId;
    private String transactionIdentification;
    private String key;

    private String emvqrcps;


    public CelcoinPixMerchantDTO getMerchant() {
        return merchant;
    }

    public void setMerchant(CelcoinPixMerchantDTO merchant) {
        this.merchant = merchant;
    }

    public String getClientRequestId() {
        return clientRequestId;
    }

    public void setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTransactionIdentification() {
        return transactionIdentification;
    }

    public void setTransactionIdentification(String transactionIdentification) {
        this.transactionIdentification = transactionIdentification;
    }
}
