package ec.edu.espe.accountingagenda.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalMenu {
    public void showPrincipalMenu() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
     //   Calendar calendar = new Calendar(); // Instancia de la clase Calendar

        do {
            try {
                System.out.println("---------- MENU PRINCIPAL ----------");
                System.out.println("1. Notas");
                System.out.println("2. Pendientes");
                System.out.println("3. Salir");
                System.out.print("Ingrese la opci�n que desea visualizar: ");

                if (scanner.hasNextInt()) {
                    option = scanner.nextInt();
                    scanner.nextLine();

                    switch (option) {
                        case 1:
                            NoteMenu noteMenu = new NoteMenu();
                            noteMenu.showNoteMenu();
                            break;
                        case 2:
                            CalendarMenu calendarMenu = new CalendarMenu();
                            calendarMenu.showCalendarMenu();
                            break;
                        case 3:
                            System.out.println("Sali� del programa exitosamente");
                            break;
                        default:
                            System.out.println("Opci�n inv�lida, ingrese de nuevo: ");
                            break;
                    }
                } else {
                    String input = scanner.nextLine();
                    System.out.println("Error: La entrada '" + input + "' no es un n�mero v�lido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Opci�n inv�lida. Debe ingresar un n�mero.");
                scanner.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Error: La entrada debe ser un n�mero v�lido.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error de argumento: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println();
        } while (option != 3);

        scanner.close(); 
    }
}