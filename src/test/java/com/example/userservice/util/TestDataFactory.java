package com.example.userservice.util;

import com.example.userservice.dto.UserRequest;
import com.example.userservice.dto.UserResponse;
import com.example.userservice.entity.User;

import java.time.LocalDateTime;

public class TestDataFactory {

    public static User createUser() {
        User user = new User();
        user.setId(1L);
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
        user.setAge(30);
        user.setCreatedAt(LocalDateTime.of(2024, 1, 15, 10, 30));
        return user;
    }

    public static UserRequest createUserRequest() {
        return new UserRequest("John Doe", "john.doe@example.com", 30);
    }

    public static UserResponse createUserResponse() {
        return new UserResponse(
                1L,
                "John Doe",
                "john.doe@example.com",
                30,
                LocalDateTime.of(2024, 1, 15, 10, 30)
        );
    }

    public static UserRequest createInvalidUserRequest() {
        return new UserRequest("", "invalid-email", -5);
    }
}
