package com.chinaunicom.usercenter.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    void testListAllUserNotEmpty() {
        ResponseEntity<List> users = restTemplate.getForEntity("/user/all", List.class);
        Assert.notEmpty(users.getBody(), "users should not be empty");
    }

    @Test
    void testListAllUserSize() {
        ResponseEntity<List> users = restTemplate.getForEntity("/user/all", List.class);
        Assert.isTrue(users.getBody().size() >= 3, "user size < 3");
    }
}