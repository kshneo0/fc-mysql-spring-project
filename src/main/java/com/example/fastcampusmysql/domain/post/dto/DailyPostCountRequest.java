package com.example.fastcampusmysql.domain.post.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * fileName : DailyPostCountRequest
 * author :  KimSangHoon
 * date : 2022/11/17
 */
public record DailyPostCountRequest(
        Long memberId,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        LocalDate firstDate,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        LocalDate lastDate
) {
}
