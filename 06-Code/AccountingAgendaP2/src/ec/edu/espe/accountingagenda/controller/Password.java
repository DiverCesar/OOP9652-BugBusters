package ec.edu.espe.accountingagenda.controller;

/**
 * author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Password {
    public static String encrypt(String password) {
        StringBuilder encryptedPassword = new StringBuilder();
        for (int i = 0; i < password.length(); i++) {
            char encryptedChar = (char) (password.charAt(i) + 1); // Sumar 1 al carácter
            encryptedPassword.append(encryptedChar); // Agregar carácter encriptado al StringBuilder
        }
        return encryptedPassword.toString();
    }
}


