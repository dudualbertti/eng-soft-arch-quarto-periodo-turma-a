package com.api.celcoin.infra.celcoin.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class CelcoinTokenDTO {

    @JsonbProperty("token_type")
    private String tokenType;
    
    @JsonbProperty("access_token")
    private String accessToken;

    @JsonbProperty("expires_in")
    private Integer expiresIn;

    

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
    
}
