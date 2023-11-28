package com.aktie.domain.mappers;

import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.entities.PixBO;

public class PixMapper {

    public static PixDTO toDto(PixBO bo){
        PixDTO dto = new PixDTO();

        dto.setKey(bo.getKey());
        dto.setMerchant(bo.getMerchant());
        dto.setTransactionIdentification(bo.getTransactionIdentification());
        dto.setTransactionId(bo.getTransactionId());
        dto.setEmvqrcps(bo.getEmvqrcps());

        return dto;
    }

    public static PixBO toBo(PixDTO dto){
        return new PixBO(dto.getKey(), dto.getMerchant(), dto.getEmvqrcps(), dto.getTransactionIdentification(), dto.getTransactionId());

    }

}
