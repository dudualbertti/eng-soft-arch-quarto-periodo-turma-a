package com.fag.infra.cellcoin.dto;

import java.util.List;

public class CellCoinProductsDTO {
    
    private List<CellCoinProductDTO> products;

    public List<CellCoinProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<CellCoinProductDTO> products) {
        this.products = products;
    }

}
