package com.example.fastcampusmysql.domain.post.dto;

/**
 * fileName : PostCommand
 * author :  KimSangHoon
 * date : 2022/11/17
 */
public record PostCommand(
        Long memberId,
        String contents
) {
}
