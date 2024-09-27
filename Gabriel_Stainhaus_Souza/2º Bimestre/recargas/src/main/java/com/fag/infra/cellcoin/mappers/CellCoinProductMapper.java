package com.fag.infra.cellcoin.mappers;

import com.fag.domain.dto.ProductDTO;
import com.fag.infra.cellcoin.dto.CellCoinProductDTO;

public class CellCoinProductMapper {
    
    public static ProductDTO toAppDTO(CellCoinProductDTO vendorDTO){
        ProductDTO appDTO = new ProductDTO();

        appDTO.setCode(vendorDTO.getCode());
        appDTO.setCost(vendorDTO.getCost());
        appDTO.setName(vendorDTO.getProductName());
        appDTO.setValue(vendorDTO.getCost());
        appDTO.setDue(vendorDTO.getDueProduct());

        return appDTO;
    }
}
