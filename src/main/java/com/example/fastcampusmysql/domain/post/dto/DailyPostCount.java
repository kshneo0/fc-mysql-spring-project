package com.example.fastcampusmysql.domain.post.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * fileName : DailyPostCount
 * author :  KimSangHoon
 * date : 2022/11/17
 */
public record DailyPostCount(
        Long memberId,
        LocalDate date,
        Long postCount
) {
}
