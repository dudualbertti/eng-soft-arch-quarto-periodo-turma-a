package com.fag.domain.repositories;

import java.util.List;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;

public interface IVendorRepository {
    
    //Responsável por listar operadoras
    List<OperatorDTO> listOperators();
    
    //Responsável por listar produtor por operadora
    List<ProductDTO> listProducts(Integer providerId);

    RechargeDTO createRecharge(RechargeDTO dto);

}
