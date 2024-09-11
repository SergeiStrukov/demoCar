package com.example.app.modelDto;

import lombok.Data;

@Data
public class RefreshTokenResponseDto {
    private String jwtToken;
    private String refreshToken;
}