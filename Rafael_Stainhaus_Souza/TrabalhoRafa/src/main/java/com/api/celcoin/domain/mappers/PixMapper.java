package com.api.celcoin.domain.mappers;


import com.api.celcoin.domain.dto.PixDTO;
import com.api.celcoin.domain.entities.PixBO;

import java.util.UUID;

public class PixMapper {

    public static PixBO toBO(PixDTO dto) {
        return new PixBO(dto.getQrCode(), dto.getTransactionId(), dto.getId() != null ? UUID.fromString(dto.getId()) : null, dto.getKey(), dto.getAmount());

    }

    public static PixDTO toDTO(PixBO bo) {

        PixDTO dto = new PixDTO();
        dto.setQrCode(bo.getQrCode());
        dto.setTransactionId(bo.getTransactionId());
        dto.setId(bo.getId() != null ? bo.getId().toString() : null);
        dto.setKey(bo.getKey());
        dto.setAmount(bo.getAmount());

        return dto;
        
    }

}
