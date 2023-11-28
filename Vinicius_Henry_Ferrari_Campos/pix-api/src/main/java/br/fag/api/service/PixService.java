package br.fag.api.service;

import br.fag.api.domain.dto.PixDTO;
import br.fag.api.domain.repositories.IPixDatabaseRepository;
import br.fag.api.domain.usecases.CreatePix;
import br.fag.api.infra.celcoin.repository.PixCelcoinRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class PixService {

    @Inject
    PixCelcoinRepository pixRepository;

    @Inject
    IPixDatabaseRepository pixDatabaseRepository;

    @Transactional
    public Response handlePix(PixDTO dto) {
        CreatePix createPix = new CreatePix(pixRepository, pixDatabaseRepository);

        PixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }
}
