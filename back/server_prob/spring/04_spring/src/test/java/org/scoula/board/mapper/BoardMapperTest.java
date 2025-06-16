package org.scoula.board.mapper;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.board.domain.BoardVO;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes={RootConfig.class})
@Log4j2
class BoardMapperTest {

    @Autowired
    private BoardMapper mapper;

    @Test
    @DisplayName("BoardMapper의 목록 불러오기")
    void getList() {
        for (BoardVO board : mapper.getList()) {
            log.info(board);
        }
    }

    @Test
    @DisplayName("no로 특정목록 불러오기")
    void get() {
        BoardVO board = mapper.get(3l);
        log.info(board);
    }

    @Test
    @DisplayName("BoardMapper의 새글 작성")
    public void create() {
        BoardVO board = new BoardVO();
        board.setTitle("새로 작성하는 글");
        board.setContent("새로 작성하는 내용");
        board.setWriter("user0");
        mapper.create(board);
        log.info(board);
    }

    @Test
    @DisplayName("Board update")
    public void update() {

        BoardVO board = new BoardVO();
        board.setNo(6L);
        board.setTitle("수정된 제목");
        board.setContent("수정된 내용");
        board.setWriter("user00");
        int count = mapper.update(board);
        log.info("업데이트 수" + count);
        log.info(mapper.get(6l));
    }

    @Test
    @DisplayName("Board delete")

    public void delete() {
        int count = mapper.delete(4l);
        log.info(count);
        for (BoardVO board : mapper.getList()) {
            log.info(board);
        }
    }
}