package com.fag.domain.mappers;

import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.entities.RechargeBO;

public class RechargeMapper {

    public static RechargeDTO toDTO(RechargeBO bo) {
        RechargeDTO dto = new RechargeDTO();

        return dto;
    }

    public static RechargeBO toBO(RechargeDTO dto) {
        return new RechargeBO(
                null,
                null,
                null,
                null);
    }

}
