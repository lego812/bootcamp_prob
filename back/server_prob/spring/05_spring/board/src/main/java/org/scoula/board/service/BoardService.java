package org.scoula.board.service;

import org.scoula.board.domain.BoardAttachmentVO;
import org.scoula.board.dto.BoardDTO;

import java.util.List;

public interface BoardService {
    public List<BoardDTO> getList();
    public BoardDTO get(Long no);
    public void create(BoardDTO board);
    public boolean update(BoardDTO board);
    public boolean delete(Long no);

    //하나의 첨부파일 정보를 알고자 하는 경우
    public BoardAttachmentVO getAttachment(Long no);
    //첨부파일을 삭제하고자 하는 경우
    public boolean deleteAttachment(Long no);
}