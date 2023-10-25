package com.fag.service;

import com.fag.domain.usecases.ListOperators;
import com.fag.infra.celcoin.repository.CelcoinVendorRepository;

public class RechargeService {
    
    public void listOperators() {
        CelcoinVendorRepository repo = new CelcoinVendorRepository();
        ListOperators listOperators = new ListOperators(repo);

        listOperators.execute();
    }
    
    public void listProducts() {

    }
    
    public void createRecharge() {

    }

}
