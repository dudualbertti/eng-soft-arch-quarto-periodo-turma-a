package br.fag.api.domain.repositories;


import br.fag.api.domain.entities.PixBO;

public interface IPixDatabaseRepository {
    PixBO persist(PixBO pixDTO);
}
