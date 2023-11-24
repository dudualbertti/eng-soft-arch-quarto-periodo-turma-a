package com.aktie.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class MpPixResponse {
    
    @JsonbProperty("Point_of_Interaction")
    private MpPixPoiDTO poi;

    public MpPixPoiDTO getPoi() {
        return poi;
    }

    public void setPoi(MpPixPoiDTO poi) {
        this.poi = poi;
    }

}
