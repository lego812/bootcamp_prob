package sec04;

import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;

import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.gt;

public class UpdateManyTest {
    public static void main(String[] args) {
        MongoCollection<Document> collection = Database.getCollection("users");

        Bson query = gt("age", 16);

        Bson updates = Updates.combine(
                Updates.set("name", "modify name"),
                Updates.currentTimestamp("lastUpdate"));

        UpdateResult result = collection.updateMany(query, updates);
        System.out.println(result.getModifiedCount());
    }
}
