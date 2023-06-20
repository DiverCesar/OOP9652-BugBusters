package ec.edu.espe.accountingagenda.model;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Author: Bug Busters, DCCO-ESPE
 * Version: 0.1
 */

public class Note {
    private String title;
    private String content;
    private ArrayList<Agenda> notes = new ArrayList<>();

    public void createNote() {
        
        Calendar calendar = new Calendar();
        Scanner scanner = new Scanner(System.in);
        boolean isValidOption = false;
        String category = "" ;
        
        System.out.println("Ingrese el t�tulo de la nota: ");
        String title = scanner.nextLine();

        System.out.println("Ingrese el contenido de la nota: ");
        String content = scanner.nextLine();

        do{
        
        System.out.println("Seleccione la categor�a de la nota:");
        System.out.println("1. Personal");
        System.out.println("2. Trabajo");
        System.out.println("3. Estudio");
        System.out.println("4. Otro");
        
            try{
            int categoryOption = scanner.nextInt();
            scanner.nextLine();



            switch (categoryOption) {
                case 1:
                    category = "Personal";
                    isValidOption = true;
                break;
                case 2:
                    category = "Trabajo";
                    isValidOption = true;
                break;
                case 3:
                    category = "Estudio";
                    isValidOption = true;
                break;
                case 4:
                    System.out.println("Ingrese la categor�a personalizada:");
                    category = scanner.nextLine();
                    isValidOption = true;
                break;
                default:
                    System.out.println("Error: Por favor, ingrese una opci�n v�lida..");
                break;
            }
            }catch(InputMismatchException e){
                String input = scanner.nextLine();
                System.out.println("Error: La entrada '" + input + "' no es un n�mero v�lido.");

            }
        
        }while(!isValidOption);

        Agenda agenda = new Agenda(title, content, category);
        notes.add(agenda);

        String group;
        Budget budget = new Budget();
        boolean isOptionValid = false;

        do {
            System.out.println("Seleccione el grupo al que desea agregar la nota:");
            System.out.println("1. Administraci�n");
            System.out.println("2. Operaciones");
            System.out.println("3. Contabilidad (Presupuesto)");

            try {
                int groupOption = scanner.nextInt();
                scanner.nextLine();

                switch (groupOption) {
                    case 1:
                        group = "Administraci�n";
                        addNoteToGroup(title, content, category, group);
                        isOptionValid = true;
                        break;
                    case 2:
                        group = "Operaciones";
                        performOperations();
                        isOptionValid = true;
                        break;
                    case 3:
                        group = "Contabilidad (Presupuesto)";
                        budget.calculateBudget();
                        isOptionValid = true;
                        break;
                    default:
                        System.out.println("Opci�n inv�lida, ingrese de nuevo: ");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: La entrada no es un n�mero v�lido.");
                scanner.nextLine(); 
            }
        } while (!isOptionValid);

    
        System.out.println("-- Nota creada --");
    
    }
    
    private void performOperations() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Seleccione la operaci�n que desea realizar:");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicaci�n");
    System.out.println("4. Divisi�n");
    int operationOption = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Ingrese el primer n�mero: ");
    double num1 = scanner.nextDouble();

    System.out.println("Ingrese el segundo n�mero: ");
    double num2 = scanner.nextDouble();
    
    double result = 0;

    switch (operationOption) {
        case 1:
            result = num1 + num2;
            System.out.println("El resultado de la suma es: " + result);
            break;
        case 2:
            result = num1 - num2;
            System.out.println("El resultado de la resta es: " + result);
            break;
        case 3:
            result = num1 * num2;
            System.out.println("El resultado de la multiplicaci�n es: " + result);
            break;
        case 4:
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("El resultado de la divisi�n es: " + result);
            } else {
                System.out.println("No se puede dividir por cero.");
            }
            break;
        default:
            System.out.println("Opci�n inv�lida.");
            break;
    }
}

    private void addNoteToGroup(String title, String content, String category, String group) {
    Agenda agenda = new Agenda(title, content, category, group);
    notes.add(agenda);
    }
    
    
    
    public void editNote() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- Notas Disponibles --");
        for (int i = 0; i < notes.size(); i++) {
            System.out.println((i + 1) + ". " + notes.get(i).getTitle());
        }

        System.out.print("Ingrese el n�mero de la nota que desea editar: ");
        int noteNumber = scanner.nextInt();
        scanner.nextLine();

        if (noteNumber >= 1 && noteNumber <= notes.size()) {
            System.out.println("Ingrese el nuevo t�tulo de la nota: ");
            String newTitle = scanner.nextLine();

            System.out.println("Ingrese el nuevo contenido de la nota: ");
            String newContent = scanner.nextLine();

            notes.get(noteNumber - 1).setTitle(newTitle);
            notes.get(noteNumber - 1).setContent(newContent);

            System.out.println("-- Nota editada --");
        } else {
            System.out.println("N�mero de nota inv�lido");
        }
    }

    public void readNote() {
        System.out.println("\n *** NOTAS DISPONIBLES ***");
        for (Agenda agenda : notes) {
            System.out.println(agenda.toString());
        }
    }
    
    public void searchNote() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el texto a buscar: ");
        String searchText = scanner.nextLine();

        ArrayList<Agenda> matchingNotes = new ArrayList<>();
        for (Agenda agenda : notes) {
            if (agenda.getTitle().contains(searchText) || agenda.getContent().contains(searchText)) {
                matchingNotes.add(agenda);
            }
        }

        if (!matchingNotes.isEmpty()) {
            System.out.println("\nCoincidencias encontradas:");
            for (Agenda agenda : matchingNotes) {
                System.out.println(agenda.toString());
            }
        } else {
            System.out.println("\nNo se encontraron coincidencias.");
        }
    }

    public void deleteNote() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- Notas Disponibles --");
        for (int i = 0; i < notes.size(); i++) {
            System.out.println((i + 1) + ". " + notes.get(i).getTitle());
        }

        System.out.print("Ingrese el n�mero de la nota que desea eliminar: ");
        int noteNumber = scanner.nextInt();
        scanner.nextLine();

        if (noteNumber >= 1 && noteNumber <= notes.size()) {
            notes.remove(noteNumber - 1);
            System.out.println("-- Nota eliminada --");
        } else {
            System.out.println("N�mero de nota inv�lido");
        }
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}