package com.fag.domain.dto;

public class RechargeDTO {

    private Double value;

    private String document;

    private Integer providerId;

    private PhoneDTO phone;

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

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public PhoneDTO getPhone() {
        return phone;
    }

    public void setPhone(PhoneDTO phone) {
        this.phone = phone;
    }

}
