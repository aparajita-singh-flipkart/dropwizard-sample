package com.flipkart.dropwizardsamplegradle.dependencies;

import com.flipkart.dropwizardsamplegradle.model.Greeting;
import com.flipkart.dropwizardsamplegradle.model.Hey;
import com.google.inject.Inject;

public class HeyDao extends AbstractDao<Hey> implements HelloDao<Hey> {

    @Inject
    public HeyDao(Greeting greeting) {
        super(greeting);
    }
}
