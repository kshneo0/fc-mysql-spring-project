package com.example.fastcampusmysql.util;

import java.util.List;

/**
 * fileName : PageCursor
 * author :  KimSangHoon
 * date : 2022/11/20
 */
public record PageCursor<T>(
        CursorRequest nextCursorRequest,
        List<T> body
){}
