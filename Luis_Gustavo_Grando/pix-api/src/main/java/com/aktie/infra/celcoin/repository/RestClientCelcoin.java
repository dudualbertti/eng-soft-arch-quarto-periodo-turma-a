package com.aktie.infra.celcoin.repository;

import com.aktie.infra.celcoin.dto.CelcoinPixDTO;
import com.aktie.infra.celcoin.dto.CelcoinPixResponseDTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface RestClientCelcoin {

    @POST
    @Path("/pix/v1/brcode/static")
    @Consumes(MediaType.APPLICATION_JSON)
    CelcoinPixResponseDTO createPix(
            @HeaderParam("Authorization") String token,
            CelcoinPixDTO payload);

    @POST
    @Path("/v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    CelcoinPixResponseDTO generateToken(Form form);
}
