package com.fag.service;

import com.fag.domain.dto.PixDTO;
import com.fag.domain.usecases.CreatePix;
import com.fag.infra.celcoin.repository.CellCoinPixRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PixService {
    
    @Inject
    CellCoinPixRepository pixRepo;

    public PixDTO generatePix(PixDTO dto){

        CreatePix createPix = new CreatePix(pixRepo);

        return createPix.execute(dto);
    }
}
