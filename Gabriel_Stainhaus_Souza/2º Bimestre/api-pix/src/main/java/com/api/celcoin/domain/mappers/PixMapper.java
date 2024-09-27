package com.api.celcoin.domain.mappers;

import com.api.celcoin.domain.entities.PixBO;
import com.api.celcoin.domain.dto.PixDTO;
import java.util.UUID;

public class PixMapper {

    public static PixDTO toDTO(PixBO bo) {
        PixDTO dto = new PixDTO();

        dto.setId(bo.getId() != null ? bo.getId().toString() : null);
        dto.setKey(bo.getKey());
        dto.setAmount(bo.getAmount());
        dto.setQrCode(bo.getQrCode());
        dto.setTransactionId(bo.getTransactionId());

        return dto;
    }

    public static PixBO toBO(PixDTO dto) {
        return new PixBO(dto.getId() != null ? UUID.fromString(dto.getId()) : null, dto.getKey(), dto.getAmount(),
                dto.getQrCode(), dto.getTransactionId());
    }

}
