package br.fag.api.domain.mappers;


import br.fag.api.domain.dto.PixDTO;
import br.fag.api.domain.entities.PixBO;

import java.util.UUID;

public class PixMapper {

    public static PixBO toBO(PixDTO dto) {
        return new PixBO(dto.getId() != null ? UUID.fromString(dto.getId()) : null, dto.getKey(), dto.getAmount(),
                dto.getEmv(), dto.getTransactionId());
    }

    public static PixDTO toDTO(PixBO bo) {
        PixDTO dto = new PixDTO();

        dto.setId(bo.getId() != null ? bo.getId().toString() : null);
        dto.setKey(bo.getKey());
        dto.setAmount(bo.getAmount());
        dto.setEmv(bo.getEmv());
        dto.setTransactionId(bo.getTransactionId());

        return dto;
    }

}
