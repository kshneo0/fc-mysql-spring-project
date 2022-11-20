package com.example.fastcampusmysql.application.controller;

import com.example.fastcampusmysql.domain.post.dto.DailyPostCount;
import com.example.fastcampusmysql.domain.post.dto.DailyPostCountRequest;
import com.example.fastcampusmysql.domain.post.dto.PostCommand;
import com.example.fastcampusmysql.domain.post.entity.Post;
import com.example.fastcampusmysql.domain.post.service.PostReadService;
import com.example.fastcampusmysql.domain.post.service.PostWriteService;
import com.example.fastcampusmysql.util.CursorRequest;
import com.example.fastcampusmysql.util.PageCursor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * fileName : PostController
 * author :  KimSangHoon
 * date : 2022/11/17
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/posts")
public class PostController {
    final private PostWriteService postWriteService;
    final private PostReadService postReadService;

    @PostMapping("")
    public Long create(PostCommand command) {
        return postWriteService.create(command);
    }

    @GetMapping("/daily-post-counts")
    public List<DailyPostCount> getDailyPostCounts(/*@RequestBody */DailyPostCountRequest request) {
        return postReadService.getDailyPostCounts(request);
    }

    @GetMapping("/members/{memberId}")
    public Page<Post> getPosts(
            @PathVariable Long memberId,
            Pageable pageRequest
    ) {
        return postReadService.getPosts(memberId, pageRequest);
    }

    @GetMapping("/members/{memberId}/by-cursor")
    public PageCursor<Post> getPostsByCursor(
            @PathVariable Long memberId,
            CursorRequest cursorRequest
    ) {
        return postReadService.getPosts(memberId, cursorRequest);
    }

}
