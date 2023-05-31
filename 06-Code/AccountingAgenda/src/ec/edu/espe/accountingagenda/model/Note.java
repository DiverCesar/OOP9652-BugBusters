package ec.edu.espe.accountingagenda.model;

import java.util.Scanner;

/**
 *
 * @author Bug Busters, DCCO-ESPE
 * @version V0.1
 */

public class Note {
    private String title;
    private String content;

    public void createNote() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el título de la nota: ");
        title = scanner.nextLine();

        System.out.println("Ingrese el contenido de la nota: ");
        content = scanner.nextLine();

        System.out.println("-- Nota creada --");
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
