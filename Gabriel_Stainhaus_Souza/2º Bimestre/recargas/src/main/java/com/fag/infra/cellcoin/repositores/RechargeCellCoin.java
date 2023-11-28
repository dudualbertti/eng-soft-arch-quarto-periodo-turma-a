package com.fag.infra.cellcoin.repositores;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.hibernate.mapping.List;

import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.repositores.IVendorRepository;
import com.fag.infra.cellcoin.dto.CellCoinRechargeDTO;
import com.fag.infra.cellcoin.dto.CellCoinRechargeResponseDTO;
import com.fag.infra.cellcoin.dto.CellCoinTokenDTO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;


@ApplicationScoped
public class RechargeCellCoin implements IVendorRepository{
 
    @Inject
    @RestClient
    RestClient restClient;






    

    private String getToken(){
        Form form = new Form();

        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

        CellCoinTokenDTO tokenDTO = restClient.generateToken(form);
        String token = "Bearer" + tokenDTO.getAccessToken();
    }

    
}
