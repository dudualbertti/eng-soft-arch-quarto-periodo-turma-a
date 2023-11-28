package com.fag.domain.usecases;

import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.repositores.IVendorRepository;

public class CreateRecharge {

    private IVendorRepository repo;

    CreateRecharge(IVendorRepository repo){
        this.repo = repo;
    }

    public RechargeDTO execute(RechargeDTO dto){
        return repo.createRecharge(dto);
    }
    
}
