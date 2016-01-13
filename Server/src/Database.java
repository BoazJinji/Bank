/**
 * Created by orian on 05/01/2016.
 */
import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.net.UnknownHostException;

public class Database {

    public static void main(String[] args) {
        //
        // Creates a new instance of MongoDBClient and connect to localhost
        // port 27017.
        //
        MongoClient client = new MongoClient(
                new ServerAddress("localhost", 27017));

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


        //
        // Gets a single document / object from this collection.
        //
        FindIterable document = collection.find();

        //
        // Prints out the document.
        //
        System.out.println(document);
    }


}
