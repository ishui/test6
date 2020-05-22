package com.ishui.pojo;

import java.time.LocalDateTime;

/**
 * @Project: untitled14
 * @Package: com.ishui.pojo
 * @Author:[李晓晖]
 * @date 2020-04-20 11:39
 * @Description: [该类的功能]
 */
public class Person {
    Boy boy = null;
    LocalDateTime birth = null;

    public Boy getBoy() {
        return boy;
    }

    @Override
    public String toString() {
        return "Person{" +
                "boy=" + boy +
                ", birth=" + birth +
                '}';
    }

    public void setBoy(Boy boy) {
        this.boy = boy;
    }

    public LocalDateTime getBirth() {
        return birth;
    }

    public void setBirth(LocalDateTime birth) {
        this.birth = birth;
    }
}
