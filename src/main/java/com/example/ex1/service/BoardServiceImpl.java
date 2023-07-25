package com.example.ex1.service;

import com.example.ex1.dto.BoardDTO;
import com.example.ex1.mappers.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper;

    // 목록
    @Override
    public List<BoardDTO> boardList(BoardDTO boardDTO) {

        List<BoardDTO> list = boardMapper.boardList(boardDTO);

        return list;
    }

    // 등록
    @Override
    public int register(BoardDTO boardDTO) {

        return boardMapper.register(boardDTO);
    }

    // 조회
    @Override
    public BoardDTO read(Long bno) {

        return boardMapper.read(bno);
    }

    // 삭제
    @Override
    public int delete(Long bno) {

        return boardMapper.delete(bno);
    }

    // 수정
    @Override
    public int modify(BoardDTO boardDTO) {

        return boardMapper.modify(boardDTO);
    }
}
