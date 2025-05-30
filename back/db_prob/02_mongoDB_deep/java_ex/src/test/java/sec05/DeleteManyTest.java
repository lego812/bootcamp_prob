package sec05;

import app.Database;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gt;

public class DeleteManyTest {
    public static void main(String[] args) {
        MongoCollection<Document> collection = Database.getCollection("users");

        String id = "6839024d4ded4113e0a7559e";

        Bson query=gt("age", 15);
        DeleteResult deleteResult = collection.deleteMany(query);
        System.out.println(deleteResult.getDeletedCount());
    }
}
