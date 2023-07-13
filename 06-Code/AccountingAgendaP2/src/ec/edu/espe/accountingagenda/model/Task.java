package ec.edu.espe.accountingagenda.model;

import java.time.LocalDate;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Task {
    private String taskName;
    private String taskDescription;
    private LocalDate taskDueDate;

    public Task(String taskName, String taskDescription, LocalDate taskDueDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskDueDate = taskDueDate;
    }

    @Override
    public String toString() {
        return "\n Nombre de la tarea: " + taskName + 
               "\n Descripción: " + taskDescription +
               "\n Fecha de entrega: " + taskDueDate;
    }
    
    /**
     * @return the taskName
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @param taskName the taskName to set
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * @return the taskDescription
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * @param taskDescription the taskDescription to set
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * @return the taskDueDate
     */
    public LocalDate getTaskDueDate() {
        return taskDueDate;
    }

    /**
     * @param taskDueDate the taskDueDate to set
     */
    public void setTaskDueDate(LocalDate taskDueDate) {
        this.taskDueDate = taskDueDate;
    }
    
}
