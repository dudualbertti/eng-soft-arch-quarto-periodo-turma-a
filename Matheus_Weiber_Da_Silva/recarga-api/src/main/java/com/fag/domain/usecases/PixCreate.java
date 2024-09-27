package com.fag.domain.usecases;

import com.fag.domain.dto.PixDto;
import com.fag.domain.repositories.IPixvendor;
import jakarta.ejb.CreateException;

public class PixCreate {
    private IPixvendor pixvendor;
    public void CreateRecharge(IPixvendor pixvendor){
        this.pixvendor = pixvendor;
    }
    public PixDto execute(PixDto pixdto){
        return pixvendor.create(pixdto);
    }
}