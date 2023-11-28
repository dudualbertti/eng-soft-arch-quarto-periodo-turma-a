package com.api.celcoin.domain.repositories;

import com.api.celcoin.domain.entities.PixBO;

public interface RepositorioPix {

    PixBO persist(PixBO pixDTO);

}
