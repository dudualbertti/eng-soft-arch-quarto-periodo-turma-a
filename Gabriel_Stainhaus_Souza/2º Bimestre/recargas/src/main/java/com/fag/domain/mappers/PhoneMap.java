package com.fag.domain.mappers;

import com.fag.domain.entities.PhoneBO;
import com.fag.domain.dto.PhoneDTO;

public class PhoneMap {
    
    public static PhoneDTO toDTO(PhoneBO bo){
        PhoneDTO dto = new PhoneDTO();

        dto.setCountryCode(bo.getCountryCode());
        dto.setNumber(bo.getNumber());
        dto.setStateCode(bo.getStateCode());

        return dto;
    }

    public static PhoneBO toBO(PhoneDTO dto){
        return new PhoneBO(
            dto.getStateCode(),
            dto.getCountryCode(),
            dto.getNumber());
    }
}
