package com.example.ex1.service.reply;


import com.example.ex1.dto.PageRequestDTO;
import com.example.ex1.dto.PageResponseDTO;
import com.example.ex1.dto.ReplyDTO;
import com.example.ex1.mappers.ReplyMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


@Service
@Log4j2
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService{

    // 의존성 주입
    private final ReplyMapper replyMapper;

    // list
    @Override
    public PageResponseDTO<ReplyDTO> getList(Integer bno, PageRequestDTO pageRequestDTO) {
        pageRequestDTO.setSize(30);
        return null;
    }

    // register
    @Override
    public Integer register(ReplyDTO replyDTO) {
        return null;
    }

    //read
    @Override
    public ReplyDTO readOne(Integer rno) {
        return replyMapper.readOne(rno);
    }

    //delete
    @Override
    public void delete(Integer rno) {
        replyMapper.delete(rno);
    }

    //modify
    @Override
    public void modify(ReplyDTO replyDTO) {
        replyMapper.modify(replyDTO);
    }
}
