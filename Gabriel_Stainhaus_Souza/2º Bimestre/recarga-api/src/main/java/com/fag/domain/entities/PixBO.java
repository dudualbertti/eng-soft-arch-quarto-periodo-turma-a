package com.fag.domain.entities;

public class PixBO {

    private String key;

    private Double amount;
    
    private int transactionId;

    private String emv;

    private String transactionIdentification;

    private String postalCode;

    private String city;

    private String name;
    
    private String merchantCategoryCode;

    public PixBO(String key, Double amount, int transactionId, String emv,
            String transactionIdentification, String postalCode, String city, String name,
            String merchantCategoryCode) {
        this.key = key;
        this.amount = amount;
        this.transactionId = transactionId;
        this.emv = emv;
        this.transactionIdentification = transactionIdentification;
        this.postalCode = postalCode;
        this.city = city;
        this.name = name;
        this.merchantCategoryCode = merchantCategoryCode;

        validate();
    }

    public void validate(){

    }

    public void update(int transactionId, String emv, String transactionIdentification){
        this.transactionId = transactionId;
        this.emv = emv;
        this.transactionIdentification = transactionIdentification;
    }

    public String getKey() {
        return key;
    }

    public Double getAmount() {
        return amount;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getEmv() {
        return emv;
    }

    public String getTransactionIdentification() {
        return transactionIdentification;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }
    
}
