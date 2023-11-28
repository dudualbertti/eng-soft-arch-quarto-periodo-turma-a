package com.aktie.service;

import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.usecases.CreatePix;
import com.aktie.infra.celcoin.repository.CelcoinPixRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PixService {
    
    @Inject
    CelcoinPixRepository celcoinPixRepository;

    public PixDTO genPix(PixDTO dto) {

        CreatePix createPix = new CreatePix(celcoinPixRepository);

        return createPix.execute(dto);
    }

}

