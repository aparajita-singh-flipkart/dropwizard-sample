package com.flipkart.dropwizardsamplegradle.dependencies;

import com.flipkart.dropwizardsamplegradle.model.Greeting;
import com.flipkart.dropwizardsamplegradle.model.Hey;
import com.google.inject.Inject;

public class HowdyDao extends AbstractDao<HowdyDao> implements HelloDao<HowdyDao> {

    @Inject
    public HowdyDao(Greeting greeting) {
        super(greeting);
    }
}
