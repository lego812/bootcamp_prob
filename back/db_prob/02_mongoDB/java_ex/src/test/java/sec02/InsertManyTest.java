package sec02;

import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertManyResult;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class InsertManyTest {
    public static void main(String[] args) {
        MongoCollection<Document> mongoCollection= Database.getCollection("todo");

        List<Document> list= new ArrayList<Document>();

        Document doc1 = new Document();
        doc1.append("title", "MongoDB1");
        doc1.append("desc","MongoDB 공부하기1");
        doc1.append("done", false);

        Document doc2 = new Document();
        doc2.append("title", "MongoDB2");
        doc2.append("desc","MongoDB 공부하기2");
        doc2.append("done", true);

        list.add(doc1);
        list.add(doc2);

        InsertManyResult result = mongoCollection.insertMany(list);
        System.out.println("==> InsertManyResult"+result.getInsertedIds());
        Database.close();
    }
}
