package ec.edu.espe.accountingagenda.model;

import java.time.LocalDate;

public class Task {
    private String title;
    private String description;
    private LocalDate dueDate;

    public Task(String title, String description, LocalDate dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return "Task: " + title + ", Description: " + description + ", Due Date: " + dueDate;
    }
}
