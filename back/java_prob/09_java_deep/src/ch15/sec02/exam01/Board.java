package ch15.sec02.exam01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Board {
    private String subject;
    private String content;
    private String writer;

    //기본 데이터 클래스 작성
//    public Board(String subject, String content, String writer) {
//        this.subject = subject;
//        this.content = content;
//        this.writer = writer;
//    }
}

