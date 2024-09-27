package com.fag.domain.entities;

public class RechargeBO {

    private Double value;

    private String document;

    private Integer providerId;

    private PhoneBO phoneBO;

    public RechargeBO(Double value, String document, Integer providerId, PhoneBO phoneBO) {
        this.value = value;
        this.document = document;
        this.providerId = providerId;
        this.phoneBO = phoneBO;
    }

    public Double getValue() {
        return value;
    }

    public String getDocument() {
        return document;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public PhoneBO getPhoneBO() {
        return phoneBO;
    }
}
