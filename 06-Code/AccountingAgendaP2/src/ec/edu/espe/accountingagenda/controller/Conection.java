package ec.edu.espe.accountingagenda.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class Conection {
    public void createConection(){
        String uri = "mongodb+srv://eludena:eludena@cluster0.sxrxhjy.mongodb.net/?retryWrites=true&w=majority";
        MongoClient mongo;
        
        try {
            mongo = new MongoClient(new MongoClientURI(uri));
            MongoDatabase database = mongo.getDatabase("dbAccountingAgenda");
            MongoCollection<Document> collection = database.getCollection("logIn");
            List<String> dataBaseNames = mongo.getDatabaseNames();
            JOptionPane.showMessageDialog(null, "Se ha iniciado correctamente sesión en "+database.getName());
            
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión"+"\nTipo de error: "+e.toString());
        }
    }
}
