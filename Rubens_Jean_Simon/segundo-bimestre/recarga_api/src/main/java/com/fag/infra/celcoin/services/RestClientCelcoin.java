package main.java.com.fag.infra.celcoin.services;

import main.com.fag.infra.celcoin.dto.request.CelcoinPixDTO;
import main.com.fag.infra.celcoin.dto.request.CelcoinRechargeDTO;
import main.com.fag.infra.celcoin.dto.request.CelcoinOperatorsDTO;
import main.com.fag.infra.celcoin.dto.request.CelcoinPixResponseDTO;
import main.com.fag.infra.celcoin.dto.request.CelcoinProductDTO;
import main.com.fag.infra.celcoin.dto.request.CelcoinRechargeResponseDTO;
import main.com.fag.infra.celcoin.dto.request.CelcoinTokenDTO;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;

@ApplicationScoped
@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface RestClientCelcoin {

  @POST
  @Path("/v5/token")
  @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
  CelcoinTokenDTO generateToken(Form form);

  @GET
  @Path("/v5/transactions/topups/providers")
  CelcoinOperatorsDTO listOperators(@HeaderParam("Authorization") String token,
      @QueryParam("stateCode") Integer stateCode, @QueryParam("category") Integer category);

  @GET
  @Path("/v5/transactions/topups/provider-values")
  CelcoinProductsDTO listProducts(@HeaderParam("Authorization") String token,
      @QueryParam("stateCode") Integer stateCode, @QueryParam("providerId") Integer operatorId);

  @POST
  @Path("/v5/transactions/topups")
  @Consumes(MediaType.APPLICATION_JSON)
  CelcoinRechargeResponseDTO handleRecharge(@HeaderParam("Authorization") String token, CelcoinRechargeDTO payload);

  @POST
  @Path("/pix/v1/brcode/static")
  @Consumes(MediaType.APPLICATION_JSON)
  CelcoinPixResponseDTO handlePix(@HeaderParam("Authorization") String token, CelcoinPixDTO pix);

}