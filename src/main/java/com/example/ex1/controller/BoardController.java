package com.example.ex1.controller;

import com.example.ex1.dto.BoardDTO;
import com.example.ex1.dto.PageRequestDTO;
import com.example.ex1.dto.PageResponseDTO;
import com.example.ex1.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/board/")
public class BoardController {

    private final BoardService boardService;

    // 목록
    @GetMapping("list")
    public void boardlist(PageRequestDTO pageRequestDTO, Model model) {

        PageResponseDTO<BoardDTO> list = boardService.boardList(pageRequestDTO);

        model.addAttribute("boardList", list);
    }

    // 등록
    @GetMapping("register")
    public void boardRegisterGet() {

        log.info("Get Register...................");
    }

    @PostMapping("register")
    public String boardRegisterPost(BoardDTO boardDTO) {

        boardService.register(boardDTO);

        log.info("Post Register...................");

        return "redirect:/board/list";
    }

   //  조회
    @GetMapping("read/{bno}")
    public String boardRead(@PathVariable("bno") Long bno, Model model) {

        log.info("GET Read...................");

        BoardDTO boardDTO = boardService.read(bno);

        model.addAttribute("read", boardDTO);

        return "/board/read";
    }

    // 삭제
    @PostMapping("delete/{bno}")
    public String boardDelete (@PathVariable("bno") Long bno) {

        log.info("POST delete......................");

        boardService.delete(bno);

        //redirectAttributes.addFlashAttribute("message", "해당 게시물이 삭제되었습니다");
        return "redirect:/board/list";
    }

    // 수정
    // GET
    @GetMapping("modify/{bno}")
    public String boardModifyGet(@PathVariable("bno") Long bno, Model model) {

        BoardDTO boardDTO = boardService.read(bno);

        model.addAttribute("board", boardDTO);

        return "/board/modify";

    }

    // POST
    @PostMapping("modify")
    public String boardModifyPost(BoardDTO boardDTO) {

        boardService.modify(boardDTO);

        log.info(boardDTO.getBno());

        return "redirect:/board/read/" + boardDTO.getBno();
    }

}
