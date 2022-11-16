package com.example.fastcampusmysql.domain.member.dto;

import java.time.LocalDate;

/**
 * fileName : RegisterMemberCommand
 * author :  KimSangHoon
 * date : 2022/11/15
 */
public record RegisterMemberCommand(
        String email,
        String nickname,
        LocalDate birthday
) {
}
