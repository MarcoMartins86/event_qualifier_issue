package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NormalEventImpl extends AbstractObserverNormalEvent {
    @Override
    public void eventFired(String message) {
        System.out.println("Runner NormalEventImpl: " + message);
    }
}
