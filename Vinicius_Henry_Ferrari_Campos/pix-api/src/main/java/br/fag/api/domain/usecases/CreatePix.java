package br.fag.api.domain.usecases;



import br.fag.api.domain.dto.PixDTO;
import br.fag.api.domain.entities.PixBO;
import br.fag.api.domain.mappers.PixMapper;
import br.fag.api.domain.repositories.IPixDatabaseRepository;
import br.fag.api.domain.repositories.IPixVendorRepository;

public class CreatePix {

    private IPixVendorRepository vendor;
    private IPixDatabaseRepository repository;

    public CreatePix(IPixVendorRepository vendor, IPixDatabaseRepository repository) {
        this.vendor = vendor;
        this.repository = repository;
    }

    public PixDTO execute(PixDTO dto) {
        PixDTO response = vendor.create(dto);
        PixBO bo = PixMapper.toBO(response);

        repository.persist(bo);

        return response;
    }


}
