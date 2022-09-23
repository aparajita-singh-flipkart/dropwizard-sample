package com.flipkart.dropwizardsamplegradle.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {
   public void setMessage(String message) {
      this.message = message;
   }

   @JsonProperty
   String message;

   public Greeting(String message) {
      this.message = message;
   }

   public Greeting() {
   }
}
