package com.haishangxian;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author: yudongjie
 * @CreateDate: 2019-12-24 22:58
 */
public class TestDemo {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("secret"));
    }
}
