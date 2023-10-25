package com.fag.domain.usecases;

import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.repositories.IVendorRepository;

public class CreateRecharge {

    private IVendorRepository repo;

    public CreateRecharge(IVendorRepository repo) {
        this.repo = repo;
    }

    public RechargeDTO execute(RechargeDTO dto) {
        return repo.createRecharge(dto);
    }

}
