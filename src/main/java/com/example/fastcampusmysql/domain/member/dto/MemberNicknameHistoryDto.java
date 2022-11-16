package com.example.fastcampusmysql.domain.member.dto;

import java.time.LocalDateTime;

/**
 * fileName : MemberNicknameHistoryDto
 * author :  KimSangHoon
 * date : 2022/11/15
 */
public record MemberNicknameHistoryDto(
        Long id,
        Long memberId,
        String nickname,
        LocalDateTime createdAt
        ) {
}
