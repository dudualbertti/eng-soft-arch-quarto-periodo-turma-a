package br.fag.api.domain.repositories;


import br.fag.api.domain.dto.PixDTO;

public interface IPixVendorRepository {
    PixDTO create(PixDTO pix);
}
