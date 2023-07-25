package com.example.ex1.dto;

// page 반환해주는 DTO

import lombok.*;

import java.util.List;

@Data
public class PageResponseDTO<E> {

    private List<E> list; // 리스트 출력해줄 List
    private Long total; // PageRequestDTO에서 getCountEnd를 담을 변수

    @Builder(builderMethodName = "withAll")
    public PageResponseDTO(List<E> list, Long total) {
        this.list = list;
        this.total = total;
    }

}
