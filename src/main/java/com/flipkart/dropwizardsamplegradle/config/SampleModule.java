package com.flipkart.dropwizardsamplegradle.config;

import com.flipkart.dropwizardsamplegradle.dependencies.HeyDao;
import com.flipkart.dropwizardsamplegradle.dependencies.HowdyDao;
import com.flipkart.dropwizardsamplegradle.model.Greeting;
import com.google.inject.Singleton;
import ru.vyarus.dropwizard.guice.module.support.DropwizardAwareModule;

public class SampleModule extends DropwizardAwareModule<SampleConfiguration> {

    @Override
    protected void configure() {
        bindSample();
    }

    private void bindSample() {
        bind(Greeting.class).in(Singleton.class);
        bind(HowdyDao.class).in(Singleton.class);
        bind(HeyDao.class).in(Singleton.class);
    }
}
