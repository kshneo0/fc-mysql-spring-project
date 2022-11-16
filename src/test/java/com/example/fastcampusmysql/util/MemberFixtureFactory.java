package com.example.fastcampusmysql.util;

import com.example.fastcampusmysql.domain.member.entity.Member;
import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;

/**
 * fileName : MemberFixtureFactory
 * author :  KimSangHoon
 * date : 2022/11/15
 */
public class MemberFixtureFactory {

    static public Member create() {
        var param = new EasyRandomParameters();
        return new EasyRandom(param).nextObject(Member.class);
    }

    static public Member create(Long seed) {

        var param = new EasyRandomParameters().seed(seed);

        return new EasyRandom(param).nextObject(Member.class);
    }
}
