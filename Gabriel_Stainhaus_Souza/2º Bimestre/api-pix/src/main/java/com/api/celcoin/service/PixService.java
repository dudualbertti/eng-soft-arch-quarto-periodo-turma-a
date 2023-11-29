package com.api.celcoin.service;

import com.api.celcoin.domain.dto.PixDTO;
import com.api.celcoin.domain.repositories.IPixDBRepository;
import com.api.celcoin.domain.usecases.PixCreate;
import com.api.celcoin.infra.celcoin.repository.CCPixRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
public class PixService {

    @Inject
    CCPixRepository pixCelcoinRepository;

    @Inject
    IPixDBRepository pixDatabaseRepository;

    @Transactional
    public Response handlePix(PixDTO dto) {
        PixCreate createPix = new PixCreate(pixCelcoinRepository, pixDatabaseRepository);

        PixDTO createdPix = createPix.execute(dto);

        return Response.ok(createdPix).build();
    }
}
