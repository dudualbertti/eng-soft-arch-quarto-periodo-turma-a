package com.api.celcoin.infra.panache.mappers;


import com.api.celcoin.domain.entities.PixBO;
import com.api.celcoin.infra.panache.model.PPix;

public class PPixMapper {

    public static PPix toEntity(PixBO bo) {
        PPix entity = new PPix();
        entity.setId(bo.getId());
        entity.setKey(bo.getKey());
        entity.setTransactionId(bo.getTransactionId());
        entity.setEmvqrcps(bo.getQrCode());
        entity.setAmount(bo.getAmount());

        return entity;
    }
    
    public static PixBO toDomain(PPix entity) {

        return new PixBO(entity.getId(), entity.getKey(), entity.getAmount(), entity.getEmvqrcps(), entity.getTransactionId());

    }

}
