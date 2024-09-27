package com.fag.infra.cellcoin.dto;

public class CellCoinRechargeDTO {

    private String cpfCnpj;

    private Integer providerId;

    private CellCoinPhoneDTO phone;

    private CellCoinRechargeValueDTO topuppData;

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public CellCoinPhoneDTO getPhone() {
        return phone;
    }

    public void setPhone(CellCoinPhoneDTO phone) {
        this.phone = phone;
    }

    public CellCoinRechargeValueDTO getTopuppData() {
        return topuppData;
    }

    public void setTopuppData(CellCoinRechargeValueDTO topuppData) {
        this.topuppData = topuppData;
    }
    
}
