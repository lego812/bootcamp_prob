package App;

import App.domain.Todo;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // todo 컬렉션 추출
        MongoCollection<Todo> collection = Database.getCollection("todo", Todo.class);

        // 단일 insert
        Todo todo1 = new Todo(null, "박다빈", false, "박다빈멋쟁이");
        collection.insertOne(todo1);

        // 다중 insert
        List<Todo> newTodos = Arrays.asList(
                new Todo(null, "POJO2",false, "POJO2 테스트 확인"),
                new Todo(null, "POJO3",true, "POJO3 테스트 확인"),
                new Todo(null, "POJO4",false, "POJO4 테스트 확인")
        );

        collection.insertMany(newTodos);

        // 전체 todo 목록 출력
        List<Todo> list = new ArrayList<>();
        collection.find().into(list);

        for (Todo todo : list) {
            System.out.println(todo);
        }

        // 특정 id값 기반으로 검색 후 출력
        String id="68391b7bd01e680893fb6836";
        Bson query = Filters.eq("id", id);
        Todo todo3=collection.find(query).first();
        System.out.println(todo3);

        Database.close();
//    }
    }
}
