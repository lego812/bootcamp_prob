package org.scoula.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.scoula.board.domain.BoardAttachmentVO;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.service.BoardService;
import org.scoula.util.UploadFiles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.File;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
@Log4j2
public class BoardController {
    private final BoardService service;

    @GetMapping("/list")
    public void list(Model model) {
        log.info("list....");
        model.addAttribute("list", service.getList());
    }

    @GetMapping("/get")
    public void get(@RequestParam("no") Long no, Model model) {
        log.info("get....");
        model.addAttribute("board", service.get(no));
    }

    @GetMapping("/create")
    public void create() {
        log.info("글쓰기창 진입 성공");
    }

    @PostMapping("/create")
    public String create(BoardDTO board) {
        log.info("글쓰기 성공");
        service.create(board);
        return "redirect:/board/list";
    }

    @GetMapping("/update")
    public void update(@RequestParam("no") Long no, Model model) {
        log.info("update....");
        model.addAttribute("board", service.get(no));
    }

    @PostMapping("/update")
    public String update(BoardDTO board) {
        log.info("update 성공");
        service.update(board);
        return "redirect:/board/list";
    }

    @PostMapping("delete")
    public String delete(@RequestParam("no") Long no) {
        log.info("삭제완료.....");
        service.delete(no);
        return "redirect:/board/list";
    }

    @GetMapping("/download/{no}")
    @ResponseBody // view를 사용하지 않고, 직접 내보냄
    public void download(@PathVariable("no") Long no, HttpServletResponse response) throws Exception {
        BoardAttachmentVO attach = service.getAttachment(no);
        File file = new File(attach.getPath());
        UploadFiles.download(response, file, attach.getFilename());
    }
}
