package ec.edu.espe.accountingagenda.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bug Busters, DCCO-ESPE
 * @version V0.1
 */

public class Note {
    private String title;
    private String content;
    Agenda agenda;
    
    ArrayList<Agenda> notes = new ArrayList<>();
    
    public void createNote() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título de la nota: ");
        title = scanner.nextLine();

        System.out.println("Ingrese el contenido de la nota: ");
        content = scanner.nextLine();
        
        agenda = new Agenda(title,content);
        notes.add(agenda);
        
        System.out.println("-- Nota creada --");
    }
    
    public void editNote() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el nuevo título de la nota: ");
    String newTitle = scanner.nextLine();

    System.out.println("Ingrese el nuevo contenido de la nota: ");
    String newContent = scanner.nextLine();

    setTitle(newTitle);
    setContent(newContent);

    System.out.println("-- Nota editada --");
}

    public void readNote() {
        System.out.println("Notas:" + notes);
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
