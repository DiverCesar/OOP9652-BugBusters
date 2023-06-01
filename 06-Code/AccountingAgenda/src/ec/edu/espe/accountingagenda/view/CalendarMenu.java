package ec.edu.espe.accountingagenda.view;

import java.util.Scanner;

/**
 * Author: Bug Busters, DCCO-ESPE
 * Version: 0.1
 */

public class CalendarMenu {
    public void showCalendarMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("---------- MENU DE CALENDARIO ----------");
            System.out.println("1. Añadir Tarea");
            System.out.println("2. Añadir Evento");
            System.out.println("3. Mostrar Pendientes");
            System.out.println("4. Volver al Menú Principal");
            System.out.print("Ingrese la opción que desea visualizar: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    // Añadir Tarea
                    break;
                case 2:
                    // Añadir Evento
                    break;
                case 3:
                    // Mostrar Pendientes
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opción inválida, ingrese de nuevo: ");
                    break;
            }

            System.out.println();
        } while (option != 4);
    }
}
