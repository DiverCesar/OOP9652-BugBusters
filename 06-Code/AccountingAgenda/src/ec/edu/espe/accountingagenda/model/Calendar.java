package ec.edu.espe.accountingagenda.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calendar {
    private List<Task> tasks;
    private List<Event> events;

    public Calendar() {
        tasks = new ArrayList<>();
        events = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<Event> getEvents() {
        return events;
    }
}
