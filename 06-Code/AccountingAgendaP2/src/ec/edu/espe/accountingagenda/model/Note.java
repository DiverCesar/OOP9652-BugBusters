package ec.edu.espe.accountingagenda.model;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */

public class Note {
    private String title;
    private String content;

    public Note(String title, String description) {
        this.title = title;
        this.content = description;
    }

    @Override
    public String toString() {
        return "\n Titulo: " + title + 
               "\n Descripción: " + content;
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
