package br.fag.api.infra.panache.repository;


import br.fag.api.domain.entities.PixBO;
import br.fag.api.domain.repositories.IPixDatabaseRepository;
import br.fag.api.infra.panache.mapper.PanachePixMapper;
import br.fag.api.infra.panache.model.PanachePix;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PanachePixRepository implements IPixDatabaseRepository {

    @Override
    public PixBO persist(PixBO bo) {
        PanachePix entity = PanachePixMapper.toEntity(bo);

        entity.persistAndFlush();

        return PanachePixMapper.toDomain(entity);
    }

}
