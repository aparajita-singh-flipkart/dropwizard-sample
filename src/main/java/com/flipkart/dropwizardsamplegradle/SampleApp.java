package com.flipkart.dropwizardsamplegradle;

import com.flipkart.dropwizardsamplegradle.config.SampleConfiguration;
import com.flipkart.dropwizardsamplegradle.config.Template;
import com.flipkart.dropwizardsamplegradle.resource.SampleResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class SampleApp extends Application<SampleConfiguration> {

    public static void main(String[] args) throws Exception {

        new SampleApp().run(args);
    }

    @Override
    public void run(SampleConfiguration sampleConfiguration, Environment environment) throws Exception {
        Template template = sampleConfiguration.buildTemplate();
        environment.jersey().register(new SampleResource(template));
    }

    @Override
    public void initialize(Bootstrap<SampleConfiguration> bootstrap) {

    }
}
