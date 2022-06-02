package com.flipkart.dropwizardsamplegradle.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import javax.validation.constraints.NotEmpty;

public class SampleConfiguration extends Configuration {

   @NotEmpty
   private String templateMessage;

   @NotEmpty
   private String defaultName;

   @JsonProperty
   public String getTemplateMessage() {

      return templateMessage;
   }

   @JsonProperty
   public void setTemplateMessage(String templateMessage) {

      this.templateMessage = templateMessage;
   }

   @JsonProperty
   public String getDefaultName() {

      return defaultName;
   }

   @JsonProperty
   public void setDefaultName(String defaultName) {

      this.defaultName = defaultName;
   }

   public Template buildTemplate() {
      return new Template(defaultName, templateMessage);
   }
}
