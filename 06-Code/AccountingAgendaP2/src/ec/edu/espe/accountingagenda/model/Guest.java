package ec.edu.espe.accountingagenda.model;

/**
 *
 * @author LENOVO
 */
public class Guest {

    private String user;
    private String pasword;

    public Guest(String user, String pasword) {
        this.user = user;
        this.pasword = pasword;
    }

    public Object[] toObjectArray() {
        return new Object[]{this.user, this.pasword};
    }

    @Override
    public String toString() {
        return "\nuser: " + user + 
                "\npasword: " + pasword;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

}
