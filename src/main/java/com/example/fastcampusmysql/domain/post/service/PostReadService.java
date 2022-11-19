package com.example.fastcampusmysql.domain.post.service;

import com.example.fastcampusmysql.domain.post.dto.DailyPostCount;
import com.example.fastcampusmysql.domain.post.dto.DailyPostCountRequest;
import com.example.fastcampusmysql.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * fileName : PostReadService
 * author :  KimSangHoon
 * date : 2022/11/17
 */
@RequiredArgsConstructor
@Service
public class PostReadService {
    final private PostRepository postRepository;

    public List<DailyPostCount> getDailyPostCounts(DailyPostCountRequest request) {
        /**
         * 반환 값 -> 리스트[작성일자, 작성회원, 작성 개시물 개]
         * select createdDate, memberId, count(id)
         * from Post
         * where memberId = :memberId and createdDate between firstDate and lastDate
         * group by createdDate, memberId
         */
        return postRepository.groupByCreatedDate(request);
    }
}
