package com.api.celcoin.domain.mappers;


import com.api.celcoin.domain.dto.MerchantDTO;
import com.api.celcoin.domain.entities.MerchantBO;

public class MerchantMapper {

    public static MerchantBO toBO(MerchantDTO dto) {
        return new MerchantBO( dto.getCategoryCode(), dto.getName(),dto.getPostalCode(), dto.getCity());

    }

    public static MerchantDTO toDTO(MerchantBO bo) {

        MerchantDTO dto = new MerchantDTO();
        dto.setCategoryCode(bo.getCategoryCode());
        dto.setName(bo.getName());
        dto.setPostalCode(bo.getPostalCode());
        dto.setCity(bo.getCity());

        return dto;
        
    }
}
