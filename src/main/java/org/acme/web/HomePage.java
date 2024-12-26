package org.acme.web;

import io.quarkiverse.renarde.htmx.HxController;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.Qute;
import io.quarkus.qute.TemplateInstance;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
@RequestScoped
public class HomePage extends HxController {

    @CheckedTemplate
    public static class Views {
        public static native TemplateInstance index(int menuIndex);
        public static native TemplateInstance index$content(int menuIndex);
    }

    @GET
    @Path("/")
    public TemplateInstance index() {
        if (isHxRequest()) {
            return concatTemplates(Qute.fmt("<title>Lorem Ipsum - Home</title>").instance(), Templates.navigation$topNav(0), Views.index$content(0));
        }
        return Views.index(0);
    }
}
