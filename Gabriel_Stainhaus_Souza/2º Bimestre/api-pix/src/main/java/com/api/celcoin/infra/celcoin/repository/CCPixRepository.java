package com.api.celcoin.infra.celcoin.repository;

import com.api.celcoin.domain.dto.PixDTO;
import com.api.celcoin.domain.repositories.IPixRepository;
import com.api.celcoin.infra.celcoin.dto.CCPixDTO;
import com.api.celcoin.infra.celcoin.dto.CCPixResponseDTO;
import com.api.celcoin.infra.celcoin.dto.CCTokenDTO;
import com.api.celcoin.infra.celcoin.mappers.CCPixMapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class CCPixRepository implements IPixRepository {

    @Inject
    @RestClient
    CCRestClient restClient;

    @Override
    public PixDTO create(PixDTO pix) {
        CCPixDTO pixDTO = CCPixMapper.toVendorDTO(pix);

        CCPixResponseDTO response = restClient.handlePix(getToken(), pixDTO);

        pix.setQrCode(response.getQrCode());
        pix.setTransactionId(response.getTransactionId());

        return pix;
    }

    private String getToken() {
        Form form = new Form();

        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

        CCTokenDTO tokenDTO = restClient.generateToken(form);
        String token = "Bearer " + tokenDTO.getAccessToken();

        return token;
    }

}
