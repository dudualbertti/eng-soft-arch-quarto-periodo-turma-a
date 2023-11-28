package com.fag.infra.cellcoin.dto;

public class CellCoinOperatorDTO {

    private Integer category;

    private Integer rechargeType;

    private String name;

    private Integer provideId;

    private Double maxValue;

    private Double minValue;

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(Integer rechargeType) {
        this.rechargeType = rechargeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProvideId() {
        return provideId;
    }

    public void setProvideId(Integer provideId) {
        this.provideId = provideId;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }
    
}
