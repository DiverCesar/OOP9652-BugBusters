package ec.edu.espe.accountingagenda.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Bug Busters, DCCO-ESPE
 */
public class MongoDBConnection {
   private static MongoDBConnection instance;
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    private MongoDBConnection() {
        String uri = "mongodb+srv://eludena:eludena@cluster0.sxrxhjy.mongodb.net/?retryWrites=true&w=majority";
        String db = "Pruebas";
        mongoClient = MongoClients.create(uri);
        database = mongoClient.getDatabase(db);
    }

    public static MongoDBConnection getInstance() {
        if (instance == null) {
            instance = new MongoDBConnection();
        }
        return instance;
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public MongoCollection<Document> getCollection(String collections) {
        return database.getCollection(collections);
    }
    
}
    

