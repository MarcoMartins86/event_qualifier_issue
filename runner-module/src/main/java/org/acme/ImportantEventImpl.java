package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ImportantEventImpl extends AbstractObserverImportantEvent {
    @Override
    public void eventFired(String message) {
        System.out.println("Runner ImportantEventImpl: " + message);
    }
}
