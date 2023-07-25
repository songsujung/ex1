package com.example.ex1.mapper;

import com.example.ex1.dto.BoardDTO;
import com.example.ex1.mappers.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Log4j2
public class BoardMapperTests {

    @Autowired(required = false)
    private BoardMapper boardMapper;

    // 목록
    @Test
    @Transactional
    public void testlist() {
        BoardDTO boardDTO = BoardDTO.builder().build();

        log.info("=======================================");
        log.info(boardMapper.boardList(boardDTO));
    }

    // 등록
    @Test
    @Transactional
    public void testRegister() {
        BoardDTO boardDTO = BoardDTO.builder()
                .title("title")
                .content("content")
                .writer("writer")
                .build();

        log.info("=============================================");
        boardMapper.register(boardDTO);
        log.info("등록되었습니다.");
    }

    // 조회
    @Test
    @Transactional
    public void testRead() {

        log.info("=============================================");
            BoardDTO readBoard = boardMapper.read(4085L);
            log.info(readBoard);
    }

    // 삭제
    @Test
    @Transactional
    public void testDelete() {

        log.info("=============================================");
        boardMapper.delete(1L);
        log.info("삭제되었습니다.");
    }

    // 수정
    @Test
    public void testModify() {

        BoardDTO boardDTO = BoardDTO.builder()
                .bno(4085L)
                .title("title123")
                .content("content123")
                .build();

        boardMapper.modify(boardDTO);
        log.info("수정되었습니다.");
    }



}
