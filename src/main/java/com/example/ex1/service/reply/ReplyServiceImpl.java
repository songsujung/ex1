package com.example.ex1.service.reply;


import com.example.ex1.dto.PageRequestDTO;
import com.example.ex1.dto.PageResponseDTO;
import com.example.ex1.dto.ReplyDTO;
import com.example.ex1.mappers.ReplyMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService{

    // 의존성 주입
    private final ReplyMapper replyMapper;

    // list
    @Override
    public PageResponseDTO<ReplyDTO> getList(Integer bno, PageRequestDTO pageRequestDTO) {

        //30개씩 불러오게 사이즈 조정
        pageRequestDTO.setSize(30);

        //total
        int total = replyMapper.getBnoCount(bno);

        //page번호
        int pageNum = pageRequestDTO.getPage();

        //끝페이지 계산
        if(!pageRequestDTO.isReplyLast()){
            //페이지 넘버에 넣어주기
            pageNum = (int) (Math.ceil(total/(double)pageRequestDTO.getSize()));

            //페이지번호가 0보다 작거나 같으면 1로 설정
            pageNum = pageNum <= 0 ? 1 : pageNum;
        }
        //끝페이지 번호로 설정
        pageRequestDTO.setPage(pageNum);

        //list
        List<ReplyDTO> list = replyMapper.getList(bno, pageRequestDTO);

        return null; // ing
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
