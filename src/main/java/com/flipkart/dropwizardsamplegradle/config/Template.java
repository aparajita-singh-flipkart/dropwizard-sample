package com.flipkart.dropwizardsamplegradle.config;

import java.util.Optional;

public class Template {
   private String name;
   private String message;

   public Template(String name, String message) {

      this.name = name;
      this.message = message;
   }

   public String getName() {

      return name;
   }

   public void setName(String name) {

      this.name = name;
   }

   public String getMessage() {

      return message;
   }

   public void setMessage(String message) {

      this.message = message;
   }

   public String render(Optional<String> name) {

      return String.format(this.message, name.orElse(this.name));
   }
}
