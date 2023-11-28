package com.fag.domain.mappers;

import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.entities.PhoneBO;
import com.fag.domain.entities.RechargeBO;

public class RechargeMap {
    
    public static RechargeDTO toDTO(RechargeBO bo){
        RechargeDTO dto = new RechargeDTO();

        dto.setDocument(bo.getDocument());
        dto.setProviderId(bo.getProviderId());
        dto.setValue(bo.getValue());
        dto.setPhoneDTO(PhoneMap.toDTO(bo.getPhoneBO()));

        return dto;
    }

    public static RechargeBO toBO(RechargeDTO dto){
        return new RechargeBO(
            dto.getValue(),
            dto.getDocument(),
            dto.getProviderId(),
            PhoneMap.toBO(dto.getPhoneDTO())
            );
    }
}
