package org.scoula.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.scoula.board.domain.BoardVO;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Log4j2
@Service
@RequiredArgsConstructor

public class BoardServiceImpl implements BoardService {

    final private BoardMapper boardMapper;

//    @Autowired
//    public BoardServiceImpl(BoardMapper boardMapper) {
//        this.Mapper = boardMapper;
//    }

    @Override
    public List<BoardDTO> getList() {
        return boardMapper.getList().stream() // BoardVO의 스트림
                .map(BoardDTO::of)
                .toList();
    }

    @Override
    public BoardDTO get(Long no) {
        BoardVO vo = boardMapper.get(no);
        BoardDTO dto = BoardDTO.of(vo);
        return dto;
    }

    @Override
    public void create(BoardDTO board) {

    }

    @Override
    public boolean update(BoardDTO board) {
        return false;
    }

    @Override
    public boolean delete(Long no) {
        return false;
    }
}
