package org.acme.web;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/products")
public class ProductPage {
    @CheckedTemplate
    public static class Views {
        public static native TemplateInstance index();
    }

    @GET
    @Path("/")
    public TemplateInstance index() {
        return Views.index();
    }

}
