package com.example.webclient.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class WebDto {

    private int id;
    private String title;
    private String contents;
    private String writer;
    private Date regDate;
    private int viewCnt;

}
