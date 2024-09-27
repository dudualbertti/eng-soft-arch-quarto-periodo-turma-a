package com.aktie.infra.celcoin.repository;

import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.repositories.IPixRepository;
import com.aktie.infra.celcoin.dto.CelcoinPixDTO;
import com.aktie.infra.celcoin.dto.CelcoinPixMerchantDTO;
import com.aktie.infra.celcoin.dto.CelcoinPixResponseDTO;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;

@ApplicationScoped
public class CelcoinPixRepository implements IPixRepository {

    @Inject
    @RestClient
    RestClientCelcoin restClient;


    @Override
    public PixDTO create(PixDTO dto) {

        String token = "Bearer "+restClient.generateToken(getToken()).getAcessToken();
        CelcoinPixMerchantDTO payerDTO = new CelcoinPixMerchantDTO();
        CelcoinPixDTO pixDTO = new CelcoinPixDTO();

        payerDTO.setName(dto.getMerchant().getName());
        payerDTO.setPostalCode(dto.getMerchant().getPostalCode());
        payerDTO.setMerchantCategoryCode(dto.getMerchant().getMerchantCategoryCode());
        payerDTO.setCity(dto.getMerchant().getCity());

        pixDTO.setKey(dto.getKey());
        pixDTO.setMerchant(payerDTO);
        pixDTO.setTransactionIdentification(dto.getTransactionIdentification());
        CelcoinPixResponseDTO response = restClient.createPix(token, pixDTO);

        dto.setTransactionId(response.getTransactionId());
        dto.setEmvqrcps(response.getEmvqrcps());

        return dto;
    }

    public Form getToken(){
        Form form = new Form();
        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");
        return form;
    }

}
