package ec.edu.espe.accountingagenda.model;

import java.util.ArrayList;
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
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título de la nota: ");
        String title = scanner.nextLine();

        System.out.println("Ingrese el contenido de la nota: ");
        String content = scanner.nextLine();

        System.out.println("Seleccione la categoría de la nota:");
        System.out.println("1. Personal");
        System.out.println("2. Trabajo");
        System.out.println("3. Estudio");
        System.out.println("4. Otro");

        int categoryOption = scanner.nextInt();
        scanner.nextLine();

        String category;

        switch (categoryOption) {
            case 1:
                category = "Personal";
            break;
            case 2:
                category = "Trabajo";
            break;
            case 3:
                category = "Estudio";
            break;
            case 4:
                System.out.println("Ingrese la categoría personalizada:");
                category = scanner.nextLine();
            break;
            default:
                System.out.println("Opción inválida, se asignará la categoría 'Otro'.");
                category = "Otro";
            break;
        }

        Agenda agenda = new Agenda(title, content, category);
        notes.add(agenda);

        System.out.println("-- Nota creada --");
    }

    public void editNote() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-- Notas Disponibles --");
        for (int i = 0; i < notes.size(); i++) {
            System.out.println((i + 1) + ". " + notes.get(i).getTitle());
        }

        System.out.print("Ingrese el número de la nota que desea editar: ");
        int noteNumber = scanner.nextInt();
        scanner.nextLine();

        if (noteNumber >= 1 && noteNumber <= notes.size()) {
            System.out.println("Ingrese el nuevo título de la nota: ");
            String newTitle = scanner.nextLine();

            System.out.println("Ingrese el nuevo contenido de la nota: ");
            String newContent = scanner.nextLine();

            notes.get(noteNumber - 1).setTitle(newTitle);
            notes.get(noteNumber - 1).setContent(newContent);

            System.out.println("-- Nota editada --");
        } else {
            System.out.println("Número de nota inválido");
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

        System.out.print("Ingrese el número de la nota que desea eliminar: ");
        int noteNumber = scanner.nextInt();
        scanner.nextLine();

        if (noteNumber >= 1 && noteNumber <= notes.size()) {
            notes.remove(noteNumber - 1);
            System.out.println("-- Nota eliminada --");
        } else {
            System.out.println("Número de nota inválido");
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
