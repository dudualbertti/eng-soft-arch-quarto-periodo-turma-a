package com.fag.domain.entities;

public class RechargeBO {
    
    private Double value;

    private String document;

    private int providerId;

    private PhoneBO PhoneBO;

    public RechargeBO(Double value, String document, int providerId, com.fag.domain.entities.PhoneBO phoneBO) {
        this.value = value;
        this.document = document;
        this.providerId = providerId;
        PhoneBO = phoneBO;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public PhoneBO getPhoneBO() {
        return PhoneBO;
    }

    public void setPhoneBO(PhoneBO phoneBO) {
        PhoneBO = phoneBO;
    }


}
