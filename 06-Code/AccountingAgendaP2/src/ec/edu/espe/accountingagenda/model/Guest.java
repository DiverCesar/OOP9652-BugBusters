package ec.edu.espe.accountingagenda.model;

/**
 *
 * @author LENOVO
 */
public class Guest {

    private String user;
    private String password;

    public Guest(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public Object[] toObjectArray() {
        return new Object[]{this.user, this.password};
    }

    @Override
    public String toString() {
        return "\nuser: " + user
                + "\npasword: " + password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasword() {
        return password;
    }

    public void setPasword(String password) {
        this.password = password;
    }

}
