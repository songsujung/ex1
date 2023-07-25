package com.example.ex1.mappers;

import com.example.ex1.dto.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

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
