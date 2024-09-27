package com.api.celcoin.infra.celcoin.mappers;


import com.api.celcoin.domain.dto.MerchantDTO;
import com.api.celcoin.infra.celcoin.dto.CCMerchantDTO;

public class CCMerchantMapper {

    public static CCMerchantDTO toVendorDTO(MerchantDTO appDTO) {
        CCMerchantDTO dto = new CCMerchantDTO();

        dto.setPostalCode(appDTO.getPostalCode());
        dto.setCity(appDTO.getCity());
        dto.setMerchantCategoryCode(appDTO.getCategoryCode());
        dto.setName(appDTO.getName());

        return dto;
    }

    public static MerchantDTO toAppDTO(CCMerchantDTO vendorDTO) {
        MerchantDTO dto = new MerchantDTO();

        dto.setPostalCode(vendorDTO.getPostalCode());
        dto.setCity(vendorDTO.getCity());
        dto.setCategoryCode(vendorDTO.getMerchantCategoryCode());
        dto.setName(vendorDTO.getName());

        return dto;
    }
}
