package ec.edu.espe.accountingagenda.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class JsonGenerator {
    private static final String FILE_NAME = "agenda.json";

    public static void generateJson(Calendar calendar) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            gson.toJson(calendar, writer);
            System.out.println("Archivo JSON generado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al generar el archivo JSON: " + e.getMessage());
        }
    }
}