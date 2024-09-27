package com.fag.domain.dto;

import com.fag.domain.entities.PhoneBO;

public class RechargeDTO {
    
    private Double value;

    private String document;

    private Integer providerId;

    private PhoneDTO phoneDTO;

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

    public PhoneDTO getPhoneDTO() {
        return phoneDTO;
    }

    public void setPhoneDTO(PhoneDTO phoneDTO) {
        this.phoneDTO = phoneDTO;
    }

    

    


}
