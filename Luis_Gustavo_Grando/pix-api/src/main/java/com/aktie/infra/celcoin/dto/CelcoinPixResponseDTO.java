package com.aktie.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

import java.math.BigDecimal;

public class CelcoinPixResponseDTO {

    @JsonbProperty("transactionId")
    private long transactionId;

    @JsonbProperty("emvqrcps")
    private String emvqrcps;
    @JsonbProperty("access_token")
    private String acessToken;

    @JsonbProperty("transactionIdentification")
    private String transactionIdentification;

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public String getEmvqrcps() {
        return emvqrcps;
    }

    public void setEmvqrcps(String emvqrcps) {
        this.emvqrcps = emvqrcps;
    }

    public String getTransactionIdentification() {
        return transactionIdentification;
    }

    public void setTransactionIdentification(String transactionIdentification) {
        this.transactionIdentification = transactionIdentification;
    }

    public String getAcessToken() {
        return acessToken;
    }

    public void setAcessToken(String acessToken) {
        this.acessToken = acessToken;
    }
}
