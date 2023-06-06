package ec.edu.espe.accountingagenda.view;

import ec.edu.espe.accountingagenda.model.Note;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Bug Busters, DCCO-ESPE
 * @version V0.1
 */

public class NoteMenu {

    public void showNoteMenu() {
    Scanner scanner = new Scanner(System.in);
    int option = 0;
    Note note = new Note();

    do {
        try {
            System.out.println("---------- MENU DE NOTAS ----------");
            System.out.println("1. Crear Nota");
            System.out.println("2. Editar Nota");
            System.out.println("3. Ver Nota");
            System.out.println("4. Buscar Nota");
            System.out.println("5. Borrar Nota");
            System.out.println("6. Volver al Menú Principal");
            System.out.print("Ingrese la opción que desea visualizar: ");

            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        note.createNote();
                        break;
                    case 2:
                        note.editNote();
                        break;
                    case 3:
                        note.readNote();
                        break;
                    case 4:
                        note.searchNote();
                        break;
                    case 5:
                        note.deleteNote();
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Opción inválida, ingrese de nuevo: ");
                        break;
                }
            } else {
                String input = scanner.nextLine();
                System.out.println("Error: La entrada '" + input + "' no es un número válido.");
            }

            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Error: La entrada debe ser un número válido.");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    } while (option != 6);
}
    
    
}



