package com.example.ex1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.lang.model.element.NestingKind;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BoardDTO {

    private Long bno;

    private String title;

    private String content;

    private String writer;

    private Date regDate;

    private Date updateDate;


}
