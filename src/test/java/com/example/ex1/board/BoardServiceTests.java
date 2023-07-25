package com.example.ex1.board;

import com.example.ex1.dto.BoardDTO;
import com.example.ex1.mappers.BoardMapper;
import com.example.ex1.service.BoardService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Log4j2
public class BoardServiceTests {

    @Autowired
    private BoardService boardService;

    // 목록
    @Test
    public void testListService() {

        BoardDTO boardDTO = BoardDTO.builder().build();

        log.info("======================================");
        log.info(boardService.boardList(boardDTO));
    }

    // 등록
    @Test
    public void testRegisterService() {

        BoardDTO boardDTO = BoardDTO.builder()
                .title("title")
                .content("content")
                .writer("sujung")
                .build();

        log.info("======================================");
        boardService.register(boardDTO);
        log.info("등록 완료");

    }

    // 조회
    @Test
    public void testReadService() {

        log.info("===================================");
        log.info(boardService.read(2038L));
    }

    // 삭제
    @Test
    @Transactional
    public void testDeleteService() {

        log.info("===================================");
        boardService.delete(1L);
        log.info("삭제 완료");
    }

    // 수정
    @Test
    public void testModifyService() {

        BoardDTO boardDTO = BoardDTO.builder()
                .bno(4085L)
                .title("title12")
                .content("content12")
                .build();

        log.info("===================================");
        boardService.modify(boardDTO);
        log.info("수정 완료");
    }
}
