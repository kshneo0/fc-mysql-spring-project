package com.example.fastcampusmysql.application.usecase;

import com.example.fastcampusmysql.domain.follow.entity.Follow;
import com.example.fastcampusmysql.domain.follow.service.FollowReadService;
import com.example.fastcampusmysql.domain.post.dto.PostCommand;
import com.example.fastcampusmysql.domain.post.service.PostWriteService;
import com.example.fastcampusmysql.domain.post.service.TimelineWriteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * fileName : CreatePostUsecase
 * author :  KimSangHoon
 * date : 2022/11/20
 */
@RequiredArgsConstructor
@Service
public class CreatePostUsecase {
    final private PostWriteService postWriteService;

    final private FollowReadService followReadService;

    final private TimelineWriteService timelineWriteService;

    public Long execute(PostCommand postCommand) {
        var postId = postWriteService.create(postCommand);

        System.out.println("-----------------------------------postCommand.memberId() : " + postCommand.memberId());

        var followerMemberIds = followReadService.getFollowers(postCommand.memberId())
                .stream()
                .map(Follow::getFromMemberId)
                .toList();

        System.out.println("-----------------------------------followerMemberIds : " + followerMemberIds);

        timelineWriteService.deliveryToTimeline(postId, followerMemberIds);
        return postId;
    }

}
