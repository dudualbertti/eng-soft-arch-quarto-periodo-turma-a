package com.fag.infra.cellcoin.mappers;

import com.fag.domain.dto.OperatorDTO;
import com.fag.infra.cellcoin.dto.CellCoinOperatorDTO;

public class CellCoinOperatorMapper {

    public static OperatorDTO toAppDTO(CellCoinOperatorDTO vendorDTO){
        OperatorDTO appDTO = new OperatorDTO();

        appDTO.setCategory(vendorDTO.getCategory());
        appDTO.setMaxValue(vendorDTO.getMaxValue());
        appDTO.setMinValue(vendorDTO.getMinValue());
        appDTO.setName(vendorDTO.getName());
        appDTO.setProviderId(vendorDTO.getProvideId());
        appDTO.setRechargeType(vendorDTO.getRechargeType());

        return appDTO;
    }
    
}
