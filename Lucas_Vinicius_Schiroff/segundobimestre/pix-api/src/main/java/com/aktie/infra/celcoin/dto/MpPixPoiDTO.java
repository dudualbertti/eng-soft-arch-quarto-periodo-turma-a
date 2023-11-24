package com.aktie.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class MpPixPoiDTO {
    
    @JsonbProperty("transaction_data")
    private MpPixReponseTrxData trxData;

    public MpPixReponseTrxData getTrxData(){
        return trxData;
    }

    public void setTrxData(MpPixReponseTrxData trxData){
        this.trxData = trxData;
    }
}
