package com.api.celcoin.infra.celcoin.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.api.celcoin.infra.celcoin.dto.CCPixDTO;
import com.api.celcoin.infra.celcoin.dto.CCPixResponseDTO;
import com.api.celcoin.infra.celcoin.dto.CCTokenDTO;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface CCRestClient {

    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    CCTokenDTO generateToken(Form form);

    @POST
    @Path("/pix/v1/brcode/static")
    @Consumes(MediaType.APPLICATION_JSON)
    CCPixResponseDTO handlePix(@HeaderParam("Authorization") String token, CCPixDTO pix);

}
