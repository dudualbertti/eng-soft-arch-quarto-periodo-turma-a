package com.fag.infra.cellcoin.mappers;

import com.fag.domain.dto.PhoneDTO;
import com.fag.infra.cellcoin.dto.CellCoinPhoneDTO;

public class CellCoinRechargePhoneMapper {
    
    public static PhoneDTO toAppDTO(CellCoinPhoneDTO vendorDTO){
        PhoneDTO appDTO = new PhoneDTO();

        appDTO.setStateCode(vendorDTO.getStateCode());
        appDTO.setCountryCode(vendorDTO.getCountryCode());
        appDTO.setNumber(vendorDTO.getNumber());

        return appDTO;
    }

    public static CellCoinPhoneDTO toVendorDTO(PhoneDTO appDTO){
        CellCoinPhoneDTO vendorDTO = new CellCoinPhoneDTO();

        vendorDTO.setStateCode(appDTO.getStateCode());
        vendorDTO.setCountryCode(appDTO.getCountryCode());
        vendorDTO.setNumber(appDTO.getNumber());

        return vendorDTO;
    }
}
