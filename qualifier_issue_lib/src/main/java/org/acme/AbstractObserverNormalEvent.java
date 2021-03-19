package org.acme;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.EventMetadata;

public abstract class AbstractObserverNormalEvent {
    public abstract void eventFired(final String message);
    public void observer(@Observes @NormalEvent final String message, final EventMetadata metadata) {
        System.out.println("Library AbstractObserverNormalEvent: " + message + " Event qualifiers[" + metadata.getQualifiers().toString() + "]");
        eventFired(message);
    }
}
