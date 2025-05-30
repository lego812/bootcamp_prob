package App.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Todo {
    private ObjectId id;
    private String desc;
    private boolean done;
    private String title;
}
