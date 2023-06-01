package ec.edu.espe.accountingagenda.model;

/**
 *
 * @author Bug Busters, DCCO-ESPE
 * @version V0.1
 */

public class Agenda {
    private String title;
    private String content;

    @Override
    public String toString() {
        return "\nTítulo: " + title + "\nContenido: " + content;
    }
    
    public Agenda(String title, String content) {
        this.title = title;
        this.content = content;
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }
}
