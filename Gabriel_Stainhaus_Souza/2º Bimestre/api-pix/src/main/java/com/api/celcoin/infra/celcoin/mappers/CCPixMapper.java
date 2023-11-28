package com.api.celcoin.infra.celcoin.mappers;

import com.api.celcoin.domain.dto.PixDTO;
import com.api.celcoin.infra.celcoin.dto.CCPixDTO;

public class CCPixMapper {

    public static CCPixDTO toVendorDTO(PixDTO appDTO) {
        CCPixDTO dto = new CCPixDTO();

        dto.setKey(appDTO.getKey());
        dto.setAmount(appDTO.getAmount());
        dto.setMerchant(CCMerchantMapper.toVendorDTO(appDTO.getMerchant()));

        return dto;
    }

    public static PixDTO toAppDTO(CCPixDTO vendorDTO) {
        PixDTO dto = new PixDTO();
        dto.setKey(vendorDTO.getKey());
        dto.setAmount(vendorDTO.getAmount());
        dto.setMerchant(CCMerchantMapper.toAppDTO(vendorDTO.getMerchant()));

        return dto;
    }
}
