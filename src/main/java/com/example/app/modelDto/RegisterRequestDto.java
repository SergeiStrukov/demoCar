package com.example.app.modelDto;

import lombok.Data;

@Data
public class RegisterRequestDto {
    private String fullName;
    private String email;
    private String password;
}
