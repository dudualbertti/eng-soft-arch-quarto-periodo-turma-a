package com.fag.infra.celcoin.repository;

import java.util.UUID;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.repositories.IPixRepository;
import com.fag.infra.celcoin.dto.CellCoinMerchantDTO;
import com.fag.infra.celcoin.dto.CellCoinPixDTO;
import com.fag.infra.celcoin.dto.CellCoinResponseDTO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CellCoinPixRepository implements IPixRepository{

    @Inject
    @RestClient
    RestClientCelcoin restClient;


    @Override
    public PixDTO create(PixDTO dto){

        
        
        String token = "Bearer " + CelCoinTokenGenerator.CelcoinGenerateToken();
        String idempotenciKey = UUID.randomUUID().toString();

        CellCoinPixDTO pixDTO = new CellCoinPixDTO();
        CellCoinMerchantDTO merchantDTO = new CellCoinMerchantDTO();

        merchantDTO.setPostalCode(dto.getPostalCode());
        merchantDTO.setCity(dto.getCity());
        merchantDTO.setName(dto.getName());
        merchantDTO.setMerchantCategoryCode(dto.getMerchantCategoryCode());

        pixDTO.setKey(dto.getKey());
        pixDTO.setAmount(dto.getAmount());
        pixDTO.setMerchant(merchantDTO);

        CellCoinResponseDTO response = restClient.createPix(token, idempotenciKey, pixDTO);

        dto.setTransactionId(response.getTransactionId());
        dto.setEmv(response.getEmvqrcps());
        dto.setTransactionIdentification(response.getTransactionIdentification());

        

        return dto;
       
    }
}
