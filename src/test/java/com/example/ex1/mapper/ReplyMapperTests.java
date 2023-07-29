package com.example.ex1.mapper;

import com.example.ex1.dto.PageRequestDTO;
import com.example.ex1.mappers.ReplyMapper;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class ReplyMapperTests {

    @Autowired(required = false)
    private ReplyMapper replyMapper;

    // list test
    @Test
    public void testReplyList() {
        // bno
        Integer bno = 3085;

        // list
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().build();

        log.info("=================================================");
        log.info("=================================================");
        log.info(replyMapper.getList(bno, pageRequestDTO));
    }
}
