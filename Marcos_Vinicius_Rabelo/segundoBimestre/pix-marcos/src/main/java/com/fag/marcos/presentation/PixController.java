package com.fag.marcos.presentation;

import com.fag.marcos.domain.usecases.ICreatePixRequest;
import com.fag.marcos.services.MakePix;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/v1")
public class PixController {

    @Inject
    MakePix service;

    @GET
    @Transactional
    @Produces(MediaType.TEXT_PLAIN)
    public String handle(
        @HeaderParam("pix") String pix,
        @HeaderParam("value") Double value
    ) {
        System.out.println("value is " + value);
        System.out.println("pix is " + pix);
        return service.perform(new ICreatePixRequest(pix, value));
    }
}
