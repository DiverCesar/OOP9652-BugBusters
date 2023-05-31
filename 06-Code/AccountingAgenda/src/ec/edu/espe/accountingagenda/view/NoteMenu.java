package ec.edu.espe.accountingagenda.view;

import ec.edu.espe.accountingagenda.model.Note;
import java.util.Scanner;

/**
 *
 * @author Bug Busters, DCCO-ESPE
 * @version V0.1
 */

public class NoteMenu {
    public void showNoteMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        Note note = new Note();
        do {
            System.out.println("---------- MENU DE NOTAS ----------");
            System.out.println("1. Crear Nota");
            System.out.println("2. Editar Nota");
            System.out.println("3. Ver Nota");
            System.out.println("4. Buscar Nota");
            System.out.println("5. Borrar Nota");
            System.out.println("6. Volver al Menú Principal");
            System.out.print("Ingrese la opción que desea visualizar: ");
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
                    // Buscar Nota 
                break;
                case 5:
                    // Borrar Nota 
                break;
                case 6:
                return;
                default:
                    System.out.println("Opción inválida, ingrese de nuevo: ");
                    break;
            }

            System.out.println();
        } while (option != 6);
    }
}



