package com.fag.presentantion.controllers;

import com.fag.domain.dto.PixDTO;
import com.fag.service.PixService;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.Produces;


@Path("/v1")
public class PixController {
    
    @Inject
    PixService service;

    @POST
    @Path("/pix")
    @Produces(MediaType.APPLICATION_JSON)
    public PixDTO create(PixDTO dto){
        return service.generatePix(dto);
    }
}
