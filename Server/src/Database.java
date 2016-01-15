/**
 * Created by orian on 05/01/2016.
 */
import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.net.UnknownHostException;
import org.bson.Document;

public class Database {

    public static void main(String[] args) {
        //
        // Creates a new instance of MongoDBClient and connect to localhost
        // port 27017.
        //
        MongoClient client = new MongoClient(
                new ServerAddress("Localhost", 27017));

        //
        // Gets the bank from the MongoDB instance.
        //
        //DB database = client.getDB("peopledb");
        //DB database = client.getDatabase("bank");
        MongoDatabase database = client.getDatabase("bank");
        //DB database = client.getDB("bank");



        //
        // Gets the persons collections from the database.
        //
        MongoCollection collection = database.getCollection("users");
        FindIterable documents = collection.find();

        documents.forEach(new Block<Document>() {
            @Override
            public void apply(Document row) { //For every iteration
                System.out.println(row.getString("password"));
            }
        });

        //
        // Gets a single document / object from this collection.
        //

        //
        // Prints out the document.
        //
    }


}
