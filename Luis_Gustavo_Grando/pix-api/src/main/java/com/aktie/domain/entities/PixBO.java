package com.aktie.domain.entities;

import com.aktie.domain.dto.MerchantDTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class PixBO {

    private String key;
    private MerchantDTO merchant;
    private String url;
    private String emv;
    private String emvqrcps;
    private String transactionIdentification;
    private long transactionId;

    public String getKey() {
        return key;
    }

    public MerchantDTO getMerchant() {
        return merchant;
    }

    public String getUrl() {
        return url;
    }

    public String getEmv() {
        return emv;
    }

    public String getEmvqrcps() {
        return emvqrcps;
    }

    public String getTransactionIdentification() {
        return transactionIdentification;
    }

    public long getTransactionId() {
        return transactionId;
    }

    public PixBO(String key, MerchantDTO merchant, String emvqrcps, String transactionIdentification, long transactionId) {
        this.key = key;
        this.merchant = merchant;
        this.emvqrcps = emvqrcps;
        this.transactionIdentification = transactionIdentification;
        this.transactionId = transactionId;
    }

    public void updateEmvData(String emvqrcps, String transactionIdentification) {
        this.emvqrcps = emvqrcps;
        this.transactionIdentification = transactionIdentification;
    }

}
