package com.rhkr8521.mapping.api.memo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemoDetailResponseDTO {
    private Long id;
    private String title;
    private String content;
    private long likeCnt;
    private long hateCnt;
    private List<String> images;
    private boolean myMemo;
    private Long authorId;
    private String nickname;
    private String profileImage;
}
