package com.fag.infra.celcoin.dto;

public class CellCoinPixDTO {

    private String key;

    private Double amount;

    private CellCoinMerchantDTO merchant;

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

    public CellCoinMerchantDTO getMerchant() {
        return merchant;
    }

    public void setMerchant(CellCoinMerchantDTO merchant) {
        this.merchant = merchant;
    }

    
    
}
