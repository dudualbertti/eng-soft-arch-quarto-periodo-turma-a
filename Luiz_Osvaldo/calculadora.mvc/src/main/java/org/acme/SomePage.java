package org.acme;
import static java.util.Objects.*;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/some-page")
public class SomePage {

    private final Template page;

    public SomePage(Template page) {
        this.page = requireNonNull(page, "page is required");
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@QueryParam("name") String name) {
        return page.data("name", name);
    }

    @POST
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance calcular(@FormParam("valor1") Double valor1,
    @FormParam("valor2") Double valor2) {
        return page.data("name", valor1+valor2);
    }

}
