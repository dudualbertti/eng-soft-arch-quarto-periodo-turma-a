package com.fag.presatation.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class RechargeController {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String hello() {
        return "Teste bala";
    }
}
