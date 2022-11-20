package com.example.fastcampusmysql.util;

/**
 * fileName : CursorRequest
 * author :  KimSangHoon
 * date : 2022/11/20
 */
public record CursorRequest(Long key, int size) {
    public static final Long NON_KEY = -1L;

    public Boolean hasKey() {
        return key != null;
    }

    public CursorRequest next(Long key) {
        return new CursorRequest(key, size);
    }
}
