package org.acme.web;

import io.quarkiverse.renarde.htmx.HxController;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.Qute;
import io.quarkus.qute.TemplateInstance;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/products")
@RequestScoped
public class ProductPage extends HxController {
    @CheckedTemplate
    public static class Views {
        public static native TemplateInstance index(int menuIndex);
        public static native TemplateInstance index$content(int menuIndex);
    }

    @GET
    @Path("/")
    public TemplateInstance index() {
        if (isHxRequest()) {
            return concatTemplates(Qute.fmt("<title>Lorem Ipsum - Products</title>").instance(), Templates.navigation$topNav(1), Views.index$content(1));
        }
        return Views.index(1);
    }

}
