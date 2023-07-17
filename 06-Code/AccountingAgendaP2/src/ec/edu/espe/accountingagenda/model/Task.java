package ec.edu.espe.accountingagenda.model;

import java.time.LocalDate;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */

public class Task {
    private String taskName;
    private String taskDescription;
    private LocalDate taskBeginDate;
    private LocalDate taskDueDate;

    
    public Task(String taskName, String taskDescription, LocalDate taskBeginDate, LocalDate taskDueDate) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskBeginDate = taskBeginDate;
        this.taskDueDate = taskDueDate;
    }
    
    public Object[] toObjectArray() {
        return new Object[]{this.taskName, this.taskDescription, this.taskBeginDate, this.taskDueDate};
    }

    @Override
    public String toString() {
        return "\n Nombre de la tarea: " + taskName + 
               "\n Descripción: " + taskDescription +
               "\n Fecha de inicio: " + taskBeginDate +
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
     * @return the taskBeginDate
     */
    public LocalDate getTaskBeginDate() {
        return taskBeginDate;
    }

    /**
     * @param taskBeginDate the taskBeginDate to set
     */
    public void setTaskBeginDate(LocalDate taskBeginDate) {
        this.taskBeginDate = taskBeginDate;
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
