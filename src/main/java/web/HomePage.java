package web;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class HomePage {

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
