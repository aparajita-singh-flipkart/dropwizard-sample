package com.flipkart.dropwizardsamplegradle.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {
   @JsonProperty
   String message;

   public Greeting(String message) {
      this.message = message;
   }
}
