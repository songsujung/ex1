package com.example.ex1.service;

import com.example.ex1.dto.BoardDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BoardService {

    // 목록
    List<BoardDTO> boardList(BoardDTO boardDTO);

    // 등록
    int register(BoardDTO boardDTO);

    // 조회
    BoardDTO read(Long bno);

    // 삭제
    int delete(Long bno);

    // 수정
    int modify(BoardDTO boardDTO);
}
