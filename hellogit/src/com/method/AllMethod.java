package com.method;

import com.myclass.User;

/**
 * Created by Administrator on 2017/6/25.
 */
public class AllMethod {
    public String method1(String name) {
        User user = new User();
        user.setName("yanglin");
        return "hello" + user.getName();
    }
}
