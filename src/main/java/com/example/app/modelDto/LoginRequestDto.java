package com.example.app.modelDto;

import lombok.Data;

@Data
public class LoginRequestDto {
    private String email;
    private String password;
}