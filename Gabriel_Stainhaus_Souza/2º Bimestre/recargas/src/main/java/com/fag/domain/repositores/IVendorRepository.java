package com.fag.domain.repositores;

import java.util.List;

import com.fag.domain.dto.OperatorDTO;
import com.fag.domain.dto.ProductDTO;
import com.fag.domain.dto.RechargeDTO;

public interface IVendorRepository {

    List<OperatorDTO> listOperator();

    List<ProductDTO> listProducts(Integer providerId);

    RechargeDTO createRecharge(RechargeDTO dto);
    
}
