package com.fag.services;

import com.fag.domain.usecases.ListOperators;

public class Main{
    public static void main(String[] args) {
        
        RechargeService service = new RechargeService();

        service.listOperators(new ListOperators(null));


        CellCoinPixRepo cellCoinRepo = new CellCoinPixRepo();
        SantanderPixRepo santanderRepo = new SantanderPixRepo();

        service.gerarQRCode(cellCoinRepo);
        service.gerarQRCode(santanderRepo);




    }
}