package com.fag.infra.cellcoin.dto;

import java.util.List;

public class CellCoinOperatorsDTO {
    
    private List<CellCoinOperatorDTO> providers;

    public List<CellCoinOperatorDTO> getProviders() {
        return providers;
    }

    public void setProviders(List<CellCoinOperatorDTO> providers) {
        this.providers = providers;
    }

}
