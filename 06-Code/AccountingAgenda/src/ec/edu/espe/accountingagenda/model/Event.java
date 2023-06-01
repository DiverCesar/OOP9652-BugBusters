package ec.edu.espe.accountingagenda.model;

import java.time.LocalDate;

public class Event {
    private String eventName;
    private LocalDate eventDate;
    private String eventDescription;

    public Event(String eventName, LocalDate eventDate, String eventDescription) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventDescription = eventDescription;
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
        return "Event: " + eventName + ", Date: " + eventDate + ", Description: " + eventDescription;
    }
}
