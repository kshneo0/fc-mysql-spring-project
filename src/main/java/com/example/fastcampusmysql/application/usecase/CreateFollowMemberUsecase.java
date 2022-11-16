package com.example.fastcampusmysql.application.usecase;

import com.example.fastcampusmysql.domain.follow.service.FollowWriteService;
import com.example.fastcampusmysql.domain.member.service.MemberReadService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * fileName : CreateFollowMemberUsecase
 * author :  KimSangHoon
 * date : 2022/11/17
 */
@RequiredArgsConstructor
@Service
public class CreateFollowMemberUsecase {
    final private MemberReadService memberReadService;
    final private FollowWriteService followWriteService;

    public void execute(Long fromMemberId, Long toMemberId){
        /*
            1. 입력받은 memberId로 회원조회
            2. FollerWriteService.create()
         */
        var fromMember = memberReadService.getMember(fromMemberId);
        var toMember = memberReadService.getMember(toMemberId);

        followWriteService.create(fromMember, toMember);
    }
}
