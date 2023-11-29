package com.api.celcoin.infra.panache.repository;

import com.api.celcoin.domain.entities.PixBO;
import com.api.celcoin.domain.repositories.IPixDBRepository;
import com.api.celcoin.infra.panache.mappers.PPixMapper;
import com.api.celcoin.infra.panache.model.PPix;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PPixRepository implements IPixDBRepository {

    @Override
    public PixBO stay(PixBO bo) {
        PPix entity = PPixMapper.toEntity(bo);

        entity.persistAndFlush();

        return PPixMapper.toDomain(entity);
    }

}
