package ec.edu.espe.accountingagenda.view;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Bug Busters, DCCO-ESPE
 * @version V0.1
 */

public class PrincipalMenu {
    public void showPrincipalMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            
            System.out.println("---------- MENU PRINCIPAL ----------");
            System.out.println("1. Notas");
            System.out.println("2. Pendientes");
            System.out.println("3. Generar archivo JSON");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción que desea visualizar: ");
            option = scanner.nextInt();
            scanner.nextLine();
            
            try{
            
            switch (option) {
                case 1:
                    NoteMenu noteMenu = new NoteMenu();
                    noteMenu.showNoteMenu();
                    break;
                case 2:
                    // Pendientes 
                    break;
                case 3:
                    // Generar archivo JSON 
                    break;
                case 4:
                    System.out.println("Salió del programa exitosamente");
                    break;
                default:
                    System.out.println("Opción inválida, ingrese de nuevo: ");
                    break;
            }
            
                } catch (NumberFormatException e) {
                    System.out.println("Error: La entrada debe ser un número válido.");
                }catch (InputMismatchException e) {
                    System.out.println("Error: Opción inválida. Debe ingresar un número.");
                    scanner.nextLine();
                }catch (IllegalArgumentException e) {
                    System.out.println("Error de argumento: " + e.getMessage());
                }catch(Exception e){
                    System.out.println("Error: " + e.getMessage());
                }
            System.out.println();
        } while (option != 4);
    }
}
