package com.flipkart.dropwizardsamplegradle.resource;

import com.flipkart.dropwizardsamplegradle.config.Template;
import com.flipkart.dropwizardsamplegradle.model.Greeting;
import java.util.Optional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class SampleResource {
   Template template;

   public SampleResource(Template template) {

      this.template = template;
   }

   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public Greeting sayHello(@QueryParam("name") Optional<String> name) {
      return new Greeting(template.render(name));
   }
}
