package br.fag.api.infra.panache.mapper;


import br.fag.api.domain.entities.PixBO;
import br.fag.api.infra.panache.model.PanachePix;

public class PanachePixMapper {
    public static PixBO toDomain(PanachePix entity) {

        return new PixBO(entity.getId(), entity.getKey(), entity.getAmount(), entity.getEmvqrcps(), entity.getTransactionId());
    }

    public static PanachePix toEntity(PixBO bo) {
        PanachePix entity = new PanachePix();
        entity.setId(bo.getId());
        entity.setKey(bo.getKey());
        entity.setTransactionId(bo.getTransactionId());
        entity.setEmvqrcps(bo.getEmv());
        entity.setAmount(bo.getAmount());

        return entity;
    }

}
