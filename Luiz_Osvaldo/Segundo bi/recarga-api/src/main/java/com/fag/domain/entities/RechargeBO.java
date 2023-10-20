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

    public String getDocument() {
        return document;
    }

    public int getProviderId() {
        return providerId;
    }

    public PhoneBO getPhoneBO() {
        return PhoneBO;
    }



}
