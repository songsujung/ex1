package com.example.ex1.service.reply;


import com.example.ex1.dto.PageRequestDTO;
import com.example.ex1.dto.PageResponseDTO;
import com.example.ex1.dto.ReplyDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService{


    @Override
    public PageResponseDTO<ReplyDTO> getList(Integer bno, PageRequestDTO pageRequestDTO) {
        return null;
    }

    @Override
    public Integer register(ReplyDTO replyDTO) {
        return null;
    }

    @Override
    public ReplyDTO readOne(Integer rno) {
        return null;
    }

    @Override
    public void delete(Integer rno) {

    }

    @Override
    public void modify(ReplyDTO replyDTO) {

    }
}
