package ec.edu.espe.accountingagenda.model;

import java.time.LocalDate;

public class Event {
    private String eventName;
    private String eventDescription;
    private LocalDate eventDate;

    public Event(String eventName, String eventDescription, LocalDate eventDate) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDate = eventDate;
    }

    public String getEventName() {
        return eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    @Override
    public String toString() {
        return "\n Nombre de evento: " + eventName + 
               "\n Descripción: " + eventDescription +
               "\n Fecha del evento: " + eventDate;
    }
}

