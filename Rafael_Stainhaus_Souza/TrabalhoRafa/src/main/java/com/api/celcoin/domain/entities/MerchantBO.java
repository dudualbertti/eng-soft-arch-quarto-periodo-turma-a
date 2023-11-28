package com.api.celcoin.domain.entities;

public class MerchantBO {

    private Integer categoryCode;
    private String name;
    private String postalCode;
    private String city;

    public MerchantBO(Integer categoryCode, String name, String postalCode, String city) {

        this.categoryCode = categoryCode;
        this.name = name;
        this.postalCode = postalCode;
        this.city = city;

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