package com.flipkart.dropwizardsamplegradle.dependencies;

import com.flipkart.dropwizardsamplegradle.model.Greeting;
import com.google.inject.Inject;

public class AbstractDao<E> {

    Greeting greeting;

    @Inject
    public AbstractDao(Greeting greeting) {
        this.greeting = greeting;
    }

    public void storeHi(E e) {
        this.greeting.setMessage("say " + e.toString());
    }
}
