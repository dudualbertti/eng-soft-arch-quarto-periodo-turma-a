package com.fag.services;

import com.fag.domain.usecases.ListOperators;

public class RechargeService {

    public void listOperators(ListOperators listOperators){
        listOperators.execute();
    }
    
    public void listProducts(){

    }

    public void createRecharge(){

    }

    public void gerarQRCode(IPixRepositore repo){
        repo.gerarQRCode();
    }

}
