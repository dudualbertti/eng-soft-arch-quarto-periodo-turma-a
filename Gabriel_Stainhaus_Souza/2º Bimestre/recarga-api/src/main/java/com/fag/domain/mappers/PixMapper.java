package com.fag.domain.mappers;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.entities.PixBO;

public class PixMapper {
    
    public static PixDTO toDTO(PixBO pixBO){
        PixDTO dto = new PixDTO();

        dto.setKey(pixBO.getKey());
        dto.setAmount(pixBO.getAmount());
        dto.setTransactionId(pixBO.getTransactionId());
        dto.setEmv(pixBO.getEmv());
        dto.setTransactionIdentification(pixBO.getTransactionIdentification());
        dto.setPostalCode(pixBO.getPostalCode());
        dto.setCity(pixBO.getCity());
        dto.setName(pixBO.getName());
        dto.setMerchantCategoryCode(pixBO.getMerchantCategoryCode());

        return dto;
    }

    public static PixBO toBO(PixDTO pixDTO){
        return new PixBO(
            pixDTO.getKey(),
            pixDTO.getAmount(),
            pixDTO.getTransactionId(),
            pixDTO.getEmv(),
            pixDTO.getTransactionIdentification(),
            pixDTO.getPostalCode(),
            pixDTO.getCity(),
            pixDTO.getName(),
            pixDTO.getMerchantCategoryCode()
        );
    }
}
