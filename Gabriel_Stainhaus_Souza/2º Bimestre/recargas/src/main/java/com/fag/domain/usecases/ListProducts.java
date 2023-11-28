package com.fag.domain.usecases;

import com.fag.domain.repositores.IVendorRepository;
import com.fag.domain.dto.ProductDTO;
import java.util.List;

public class ListProducts {
    
    private IVendorRepository repo;

    public listProducts(IVendorRepository repo) {
        this.repo = repo;
    }

    public List<ProductDTO> execute(Integer provideId){
        return repo.listProducts(provideId);
    }

}
