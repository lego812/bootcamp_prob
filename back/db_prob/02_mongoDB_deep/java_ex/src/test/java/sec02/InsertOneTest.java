package sec02;

import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertOneResult;
import org.bson.Document;

public class InsertOneTest {
    public static void main(String[] args) {
        MongoCollection<Document> mongoCollection= Database.getCollection("todo");

        Document doc = new Document();
        doc.append("title", "MongoDB");
        doc.append("desc","MongoDB 공부하기");
        doc.append("done", false);

        InsertOneResult result= mongoCollection.insertOne(doc);
        System.out.println("==> InsestOneResult :"+result.getInsertedId());
        Database.close();
    }
}
