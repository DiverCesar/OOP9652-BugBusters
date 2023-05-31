package ec.edu.espe.accountingagenda.view;

import ec.edu.espe.accountingagenda.model.Note;
import java.util.Scanner;

/**
 *
 * @author Bug Busters, DCCO-ESPE
 * @version V0.1
 */

public class Menu {
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("---------- MENU ----------");
            System.out.println("1. Crear Nota");
            System.out.println("2. Editar Nota");
            System.out.println("3. Ver Nota");
            System.out.println("4. Buscar Nota");
            System.out.println("5. Borrar Nota");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción que desea visualizar: ");
            option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    Note note = new Note();
                    note.createNote();
                    break;
                case 2:
                    // Editar Nota
                    break;
                case 3:
                    // Ver Nota 
                    break;
                case 4:
                    // Buscar Nota 
                    break;
                case 5:
                    // Borrar Nota 
                    break;
                case 6:
                    System.out.println("Salió del programa exitosamente");
                    break;
                default:
                    System.out.println("Opción inválida, ingrese de nuevo: ");
                    break;
            }

            System.out.println();
        } while (option != 6);
    }
}



