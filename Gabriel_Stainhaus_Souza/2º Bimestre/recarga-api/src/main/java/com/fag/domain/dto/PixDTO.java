package com.fag.domain.dto;

public class PixDTO {
    
    private String key;

    private Double amount;

    private int transactionId;

    private String emv;

    private String transactionIdentification;

    private String postalCode;

    private String city;

    private String name;
    
    private String merchantCategoryCode;

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
    public int getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    public String getEmv() {
        return emv;
    }
    public void setEmv(String emv) {
        this.emv = emv;
    }
    public String getTransactionIdentification() {
        return transactionIdentification;
    }
    public void setTransactionIdentification(String transactionIdentification) {
        this.transactionIdentification = transactionIdentification;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }
    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    
}
