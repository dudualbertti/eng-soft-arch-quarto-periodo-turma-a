package com.fag.infra.cellcoin.repositores;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.fag.infra.cellcoin.dto.CellCoinOperatorsDTO;
import com.fag.infra.cellcoin.dto.CellCoinProductsDTO;
import com.fag.infra.cellcoin.dto.CellCoinTokenDTO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://sandbox.opnefinance,celcoin.dev")
public class RestClientCellCoin {

    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    CellCoinTokenDTO generateToken(Form form);

    @GET
    @Path("/v5/transactions/topups/providers")
    CellCoinOperatorsDTO listOperators(@HeaderParam("Authorization") String token, @QueryParam("statecode") Integer stateCode, @QueryParam("category") Integer category);

    @GET
    @Path("/v5/transactions/topups/provider-values")
    CellCoinProductsDTO listProducts(@HeaderParam("Authorization") String token, @QueryParam("stateCode") Integer stateCode, @QueryParam("providerId") Integer operatorId);

    @POST
    @Path("/v5/transactions/topups")
    @Consumes()
    
}
