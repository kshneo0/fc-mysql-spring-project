package com.example.fastcampusmysql.domain.member.dto;

import java.time.LocalDate;

/**
 * fileName : MemberDto
 * author :  KimSangHoon
 * date : 2022/11/15
 */
public record MemberDto(
        Long id,
        String email,
        String nickname,
        LocalDate birthday
) {
}
