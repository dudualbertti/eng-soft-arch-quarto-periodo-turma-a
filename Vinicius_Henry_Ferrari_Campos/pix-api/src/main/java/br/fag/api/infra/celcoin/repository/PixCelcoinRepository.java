package br.fag.api.infra.celcoin.repository;


import br.fag.api.domain.dto.PixDTO;
import br.fag.api.domain.repositories.IPixVendorRepository;
import br.fag.api.infra.celcoin.dto.CelcoinPixDTO;
import br.fag.api.infra.celcoin.dto.CelcoinPixResponseDTO;
import br.fag.api.infra.celcoin.dto.CelcoinTokenDTO;
import br.fag.api.infra.celcoin.mappers.CelcoinPixMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Form;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class PixCelcoinRepository implements IPixVendorRepository {

    @Inject
    @RestClient
    RestClientCelcoin restClient;

    @Override
    public PixDTO create(PixDTO pix) {
        CelcoinPixDTO pixDTO = CelcoinPixMapper.toVendorDTO(pix);

        CelcoinPixResponseDTO response = restClient.handlePix(getToken(), pixDTO);

        pix.setEmv(response.getEmv());
        pix.setTransactionId(response.getTransactionId());

        return pix;
    }

    private String getToken() {
        Form form = new Form();

        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

        CelcoinTokenDTO tokenDTO = restClient.generateToken(form);
        String token = "Bearer " + tokenDTO.getAccessToken();

        return token;
    }


}
