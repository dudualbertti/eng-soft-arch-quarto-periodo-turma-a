package com.api.celcoin.domain.entities;

public class MerchantBO {

    private Integer categoryCode;

    private String name;

    private String postalCode;

    private String city;

    public MerchantBO(String postalCode, String city, Integer categoryCode, String name) {
        this.postalCode = postalCode;
        this.city = city;
        this.categoryCode = categoryCode;
        this.name = name;
    }

    public Integer getCategoryCode() {
        return categoryCode;
    }

    public String getName() {
        return name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

}
