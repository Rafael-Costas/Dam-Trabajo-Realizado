package org.apache.maven.PruebaHibernate1;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
public class mongoCliente {

	public static void main(String[] args) {
        String connectionString = "mongodb+srv://rafaelcostas728:srvqW4efHGoAzBSx@cluster0.m5buibt.mongodb.net/?retryWrites=true&w=majority";
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                // Send a ping to confirm a successful connection
                MongoDatabase database = mongoClient.getDatabase("admin");
                database.runCommand(new Document("ping", 1));
                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }
        

        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("test"); // Nombre de la base de datos
            MongoCollection<Document> collection = database.getCollection("ejemplo"); // Nombre de la colección

            // Crear un documento con los datos que deseas insertar
            Document document = new Document("nombre", "LordPaco")
                                    .append("edad", 777)
                                    .append("ciudad", "New York");

            // Insertar el documento en la colección
            collection.insertOne(document);

            System.out.println("Documento insertado correctamente.");
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }   
    
}
