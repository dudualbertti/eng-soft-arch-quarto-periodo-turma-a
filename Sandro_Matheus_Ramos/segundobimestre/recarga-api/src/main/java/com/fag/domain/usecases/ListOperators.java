package com.fag.domain.usecases;

import java.util.List;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.repositories.IVendorRepository;

public class ListOperators {
    
    private IVendorRepository repo;

    ListOperators(IVendorRepository repo) {
        this.repo = repo;
    }

    public List<OperatorDTO> execute() {
        return repo.listOperators();
    }

}
