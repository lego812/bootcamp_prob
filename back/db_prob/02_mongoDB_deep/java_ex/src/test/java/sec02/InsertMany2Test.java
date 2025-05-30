package sec02;

import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.InsertManyResult;
import org.bson.Document;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InsertMany2Test {
    public static void main(String[] args) {
        MongoCollection<Document> mongoCollection= Database.getCollection("users");

        List<Document> list= new ArrayList<Document>();

        for (int i = 10; i < 21; i++) {
            Document doc = new Document();
            doc.append("name","user_"+i);
            doc.append("age",i);
            doc.append("created", new Date());
            list.add(doc);
        }

        InsertManyResult result=mongoCollection.insertMany(list);

        System.out.println("Result : "+result.getInsertedIds());
        Database.close();
    }
}
