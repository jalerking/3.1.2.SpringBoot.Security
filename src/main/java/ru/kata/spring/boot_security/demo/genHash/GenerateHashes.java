package ru.kata.spring.boot_security.demo.genHash;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GenerateHashes {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        System.out.println("user:  " + encoder.encode("user"));
        System.out.println("admin: " + encoder.encode("admin"));
    }
}