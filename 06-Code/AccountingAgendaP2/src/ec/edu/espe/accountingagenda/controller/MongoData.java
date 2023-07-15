package ec.edu.espe.accountingagenda.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;

import java.util.Scanner;

/**
 * Author: Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class MongoData {
    public void createData() {
        String uri = "mongodb+srv://mirandaalison:mirandaalison@cluster0.d67n2we.mongodb.net/?retryWrites=true&w=majority";
        Scanner readData = new Scanner(System.in);

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("AccountingAgenda");
            MongoCollection<Document> collection = database.getCollection("Calendar");

            System.out.print("Name: ");
            String name = readData.next();
            System.out.print("Description: ");
            String description = readData.next();
            System.out.print("Date: ");
            String date = readData.next();

            Document doc1 = new Document("Name", name).append("Description", description).append("Date", date);

            //InsertOneResult result = collection.insertOne(doc1);
        }
    }
}



