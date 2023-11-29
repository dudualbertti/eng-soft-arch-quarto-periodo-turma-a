package com.api.celcoin.domain.usecases;

import com.api.celcoin.domain.entities.PixBO;
import com.api.celcoin.domain.dto.PixDTO;
import com.api.celcoin.domain.repositories.IPixRepository;
import com.api.celcoin.domain.mappers.PixMapper;
import com.api.celcoin.domain.repositories.IPixDBRepository;

public class PixCreate {

    private IPixRepository vendor;
    private IPixDBRepository repository;

    public PixCreate(IPixRepository vendor, IPixDBRepository repository) {
        this.vendor = vendor;
        this.repository = repository;
    }

    public PixDTO execute(PixDTO dto) {
        PixDTO response = vendor.create(dto);
        PixBO bo = PixMapper.toBO(response);

        repository.stay(bo);

        return response;
    }
}
