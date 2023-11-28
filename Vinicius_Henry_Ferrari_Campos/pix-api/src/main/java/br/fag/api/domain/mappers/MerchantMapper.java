package br.fag.api.domain.mappers;



import br.fag.api.domain.dto.MerchantDTO;
import br.fag.api.domain.entities.MerchantBO;

public class MerchantMapper {
    public static MerchantBO toBO(MerchantDTO dto) {
        return new MerchantBO(dto.getPostalCode(), dto.getCity(), dto.getCategoryCode(), dto.getName());
    }

    public static MerchantDTO toDTO(MerchantBO bo) {
        MerchantDTO dto = new MerchantDTO();

        dto.setPostalCode(bo.getPostalCode());
        dto.setCity(bo.getCity());
        dto.setCategoryCode(bo.getCategoryCode());
        dto.setName(bo.getName());

        return dto;
    }
}
