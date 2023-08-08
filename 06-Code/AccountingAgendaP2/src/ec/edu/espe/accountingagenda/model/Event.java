package ec.edu.espe.accountingagenda.model;

import java.time.LocalDate;

/**
 *
 * @author Alison Miranda, BugBuster, DCCO-ESPE
 */

public class Event {
    private String eventName;
    private String eventDescription;
    private LocalDate eventDate;

    public Event(String eventName, String eventDescription, LocalDate eventDate) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDate = eventDate;
    }
    
    public Object[] toObjectArray() {
        return new Object[]{this.eventName, this.eventDescription, this.eventDate};
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }



    @Override
    public String toString() {
        return "\n Nombre de evento: " + eventName + 
               "\n Descripción: " + eventDescription +
               "\n Fecha del evento: " + eventDate;
    }
}

