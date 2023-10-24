package com.fag.domain.usecases;

import java.util.List;

import com.fag.domain.dto.ProductDTO;
import com.fag.domain.repositories.IVendorRepository;

public class ListProducts {

    private IVendorRepository repo;

    ListProducts(IVendorRepository repo) {
        this.repo = repo;
    }

    public List<ProductDTO> execute(Integer providerId) {
        return repo.listProducts(providerId);
    }

}
