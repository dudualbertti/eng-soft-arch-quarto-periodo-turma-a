package com.fag.infra.cellcoin.mappers;

import com.fag.infra.cellcoin.dto.CellCoinPhoneDTO;
import com.fag.infra.cellcoin.dto.CellCoinRechargeValueDTO;

public class CellCoinRechargeMapper {

    private String cpfCnpj;

    private Integer provideId;

    private CellCoinPhoneDTO phone;

    private CellCoinRechargeValueDTO topupData;

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Integer getProvideId() {
        return provideId;
    }

    public void setProvideId(Integer provideId) {
        this.provideId = provideId;
    }

    public CellCoinPhoneDTO getPhone() {
        return phone;
    }

    public void setPhone(CellCoinPhoneDTO phone) {
        this.phone = phone;
    }

    public CellCoinRechargeValueDTO getTopupData() {
        return topupData;
    }

    public void setTopupData(CellCoinRechargeValueDTO topupData) {
        this.topupData = topupData;
    }
    
}
