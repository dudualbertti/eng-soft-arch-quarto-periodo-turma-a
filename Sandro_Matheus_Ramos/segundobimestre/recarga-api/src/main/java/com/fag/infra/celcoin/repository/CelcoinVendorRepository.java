package com.fag.infra.celcoin.repository;

import java.util.List;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;
import com.fag.domain.repositories.IVendorRepository;

public class CelcoinVendorRepository implements IVendorRepository {

    @Override
    public List<OperatorDTO> listOperators() {
        System.out.println("Estou listando na celcoin");
        return null;
    }
    
    @Override
    public List<ProductDTO> listProducts(Integer providerId) {
        System.out.println("Estou listando produtos na celcoin");
        return null;
    }
    
    @Override
    public RechargeDTO createRecharge(RechargeDTO dto) {
        System.out.println("Criando recarga celcoin");
        return null;
    }
    
}
