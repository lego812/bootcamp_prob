package org.scoula.ex03.DTO;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data

public class TodoDTO {
    private String title;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dueDate;
}
