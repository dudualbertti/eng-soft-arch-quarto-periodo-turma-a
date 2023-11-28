package com.api.celcoin.domain.usecases;

import com.api.celcoin.domain.dto.PixDTO;
import com.api.celcoin.domain.entities.PixBO;
import com.api.celcoin.domain.mappers.PixMapper;
import com.api.celcoin.domain.repositories.RepositorioPix;
import com.api.celcoin.domain.repositories.RepositorioVendor;

public class QRCodePix {

    private RepositorioVendor vendorReposit;

    private RepositorioPix pixReposit;

    public QRCodePix(RepositorioVendor vendor, RepositorioPix repository) {

        this.vendorReposit = vendor;
        this.pixReposit = repository;

    }

    public PixDTO execute(PixDTO dto) {

        PixDTO response = vendorReposit.create(dto);
        PixBO bo = PixMapper.toBO(response);

        pixReposit.persist(bo);

        return response;

    }
    
}
