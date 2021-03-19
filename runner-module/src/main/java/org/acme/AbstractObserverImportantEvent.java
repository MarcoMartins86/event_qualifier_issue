package org.acme;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.EventMetadata;

public abstract class AbstractObserverImportantEvent {
    public abstract void eventFired(final String message);
    public void observer(@Observes @ImportantEvent final String message, final EventMetadata metadata) {
        System.out.println("Library AbstractObserverImportantEvent: " + message + " Event qualifiers[" + metadata.getQualifiers().toString() + "]");
        eventFired(message);
    }
}
