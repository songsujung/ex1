package com.example.ex1.service.reply;

import com.example.ex1.dto.PageRequestDTO;
import com.example.ex1.dto.PageResponseDTO;
import com.example.ex1.dto.ReplyDTO;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ReplyService {

    //list
    PageResponseDTO<ReplyDTO> getList(Integer bno, PageRequestDTO pageRequestDTO);

    //register
    Integer register(ReplyDTO replyDTO);

    //read
    ReplyDTO readOne(Integer rno);

    //delete
    void delete(Integer rno);

    //modify
    void modify(ReplyDTO replyDTO);

}
