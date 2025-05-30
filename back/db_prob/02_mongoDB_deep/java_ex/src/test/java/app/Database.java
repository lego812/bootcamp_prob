package app;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class Database {
    static MongoClient client;
    static MongoDatabase database;

    static {
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017/test"); //uri 담은 객체 생성
        client= MongoClients.create(connectionString); //uri 정보를 담은 클라이언츠 객체 생성
        database = client.getDatabase("todo_db"); //클라이언츠 객체를 통해 db정보 가져오기
    }
    public static void close() { // 데이터베이스 닫기
        client.close();
    }
    public static MongoDatabase getDatabase() { // 데이터베이스 참조 얻기
        return database;
    }
    public static MongoCollection<Document> getCollection(String colName) { // 전달된 컬렉션이름의 컬렉션 리턴하기
        MongoCollection<Document> mongoCollection=database.getCollection(colName);
        return mongoCollection;
    }
}
