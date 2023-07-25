package com.example.ex1.service;

import com.example.ex1.dto.BoardDTO;
import com.example.ex1.dto.PageRequestDTO;
import com.example.ex1.dto.PageResponseDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BoardService {

    // 목록
    PageResponseDTO<BoardDTO> boardList(PageRequestDTO pageRequestDTO);

    // 등록
    int register(BoardDTO boardDTO);

    // 조회
    BoardDTO read(Long bno);

    // 삭제
    int delete(Long bno);

    // 수정
    int modify(BoardDTO boardDTO);
}
