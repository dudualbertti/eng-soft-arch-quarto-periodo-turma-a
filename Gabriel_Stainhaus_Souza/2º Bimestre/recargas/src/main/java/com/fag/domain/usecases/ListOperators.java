package com.fag.domain.usecases;

import com.fag.domain.repositores.IVendorRepository;
import com.fag.domain.dto.OperatorDTO;
import java.util.List;

public class ListOperators {
    
    private IVendorRepository repo;

    public listOperators(IVendorRepository repo){
        this.repo = repo;
    }

    public List<OperatorDTO> execute(){
        return repo.listOperator();
    }

}
