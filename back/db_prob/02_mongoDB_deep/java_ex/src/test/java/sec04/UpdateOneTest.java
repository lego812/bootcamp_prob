package sec04;

import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import java.util.Iterator;

import static com.mongodb.client.model.Filters.bitsAllSet;
import static com.mongodb.client.model.Filters.eq;

public class UpdateOneTest {
    public static void main(String[] args) {
        MongoCollection<Document> collection= Database.getCollection("users");

//        Iterator<Document> iterator=collection.find().iterator();
//        while(iterator.hasNext()){
//            Document doc=iterator.next();
//            System.out.println(doc);
//        }

        String id="6839024d4ded4113e0a7559e";


        Bson query=eq("_id", new ObjectId(id));
        Bson update= Updates.combine(
                Updates.set("name","modify name"),
                Updates.currentTimestamp("lastUpdate")
        );

        UpdateResult updateResult=collection.updateOne(query, update);
        System.out.println(updateResult);
    }
}
