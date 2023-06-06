package ec.edu.espe.accountingagenda.view;

import ec.edu.espe.accountingagenda.model.Calendar;
import ec.edu.espe.accountingagenda.model.Event;
import ec.edu.espe.accountingagenda.model.Task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalendarMenu {
    private Calendar calendar;
    private Scanner scanner;
    private DateTimeFormatter formatter;

    public CalendarMenu() {
        calendar = new Calendar();
        scanner = new Scanner(System.in);
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    }

    public void showCalendarMenu() {
        int option;

        do {
            System.out.println("---------- MENU DE CALENDARIO ----------");
            System.out.println("1. A�adir Tarea");
            System.out.println("2. A�adir Evento");
            System.out.println("3. Mostrar Pendientes");
            System.out.println("4. Volver al Men� Principal");
            System.out.print("Ingrese la opci�n que desea visualizar: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addTask();
                    break;
                case 2:
                    addEvent();
                    break;
                case 3:
                    showPending();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opci�n inv�lida, ingrese de nuevo: ");
                    break;
            }

            System.out.println();
        } while (option != 4);
    }

    private void addTask() {
        System.out.println("Ingrese los datos de la tarea:");
        System.out.print("T�tulo: ");
        String title = scanner.nextLine();
        System.out.print("Descripci�n: ");
        String description = scanner.nextLine();
        System.out.print("Fecha de Vencimiento (yyyy-mm-dd): ");
        String dueDateStr = scanner.nextLine();

        LocalDate dueDate = LocalDate.parse(dueDateStr, formatter);

        Task task = new Task(title, description, dueDate);
        calendar.addTask(task);
        System.out.println("Tarea a�adida");
    }

    private void addEvent() {
        System.out.println("Ingrese los datos del evento:");
        System.out.print("Nombre del Evento: ");
        String eventName = scanner.nextLine();
        System.out.print("Descripci�n del Evento: ");
        String eventDescription = scanner.nextLine();
        System.out.print("Fecha del Evento (yyyy-mm-dd): ");
        String eventDateStr = scanner.nextLine();

        LocalDate eventDate = LocalDate.parse(eventDateStr, formatter);

        Event event = new Event(eventName, eventDate, eventDescription);
        calendar.addEvent(event);
        System.out.println("Evento a�adido");
    }

    private void showPending() {
        System.out.println("----- PENDIENTES -----");

        System.out.println("-- TAREAS:");
        if (calendar.getTasks().isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            LocalDate currentDate = LocalDate.now();
            boolean hasPendingTasks = false;
            for (Task task : calendar.getTasks()) {
                if (task.getDueDate().isAfter(currentDate)) {
                    System.out.println("-- T�tulo: " + task.getTitle());
                    System.out.println("   Descripci�n: " + task.getDescription());
                    System.out.println("   Fecha de Vencimiento: " + task.getDueDate().format(formatter));
                    System.out.println();
                    hasPendingTasks = true;
                }
            }
            if (!hasPendingTasks) {
                System.out.println("No hay tareas pendientes.");
            }
        }

        System.out.println("-- EVENTOS:");
        if (calendar.getEvents().isEmpty()) {
            System.out.println("No hay eventos pendientes.");
        } else {
            for (Event event : calendar.getEvents()) {
                System.out.println("-- Nombre: " + event.getEventName());
                System.out.println("   Descripci�n: " + event.getEventDescription());
                System.out.println("   Fecha: " + event.getEventDate().format(formatter));
                System.out.println();
            }
        }
    }

}

