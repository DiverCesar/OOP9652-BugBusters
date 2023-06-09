package ec.edu.espe.accountingagenda.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Author: Bug Busters, DCCO-ESPE
 * Version: 0.1
 */

public class Agenda {
    private String title;
    private String content;
    private LocalDateTime creationDate;
    private LocalDateTime lastModifiedDate;
    private String category;

    public Agenda(String title, String content, String category) {
        this.title = title;
        this.content = content;
        this.category = category;
        this.creationDate = LocalDateTime.now();
        this.lastModifiedDate = LocalDateTime.now();
    }

    Agenda(String title, String content, String category, String group) {
        throw new UnsupportedOperationException("Sin errores"); 
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public String getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
        this.lastModifiedDate = LocalDateTime.now();
    }

    public void setContent(String content) {
        this.content = content;
        this.lastModifiedDate = LocalDateTime.now();
    }

    public void setCategory(String category) {
        this.category = category;
        this.lastModifiedDate = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
        return "\nT�tulo: " + title + "\nContenido: " + content +
                "\nCategor�a: " + category +
                "\nFecha de Creaci�n: " + creationDate.format(formatter) +
                "\nFecha de �ltima Modificaci�n: " + lastModifiedDate.format(formatter);
    }
}

