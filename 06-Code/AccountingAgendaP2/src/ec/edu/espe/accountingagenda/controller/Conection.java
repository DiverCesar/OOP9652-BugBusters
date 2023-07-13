package ec.edu.espe.accountingagenda.controller;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClients;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class Conection {
    public void createConection(){
        String uri = "mongodb+srv://cgalarza:cgalarza@cluster0.lqbdjyg.mongodb.net/?retryWrites=true&w=majority";
        MongoClient mongo;
        
        try {
            mongo = new MongoClient(new MongoClientURI(uri));
            List<String> dataBaseNames = mongo.getDatabaseNames();
            JOptionPane.showMessageDialog(null, "Se conecto correctamente a MongoDb"+"\nLista de base de datos disponibles: "+dataBaseNames);
            
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión a MongoDb"+"\nTipo de error: "+e.toString());
        }
    }
}
