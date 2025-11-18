package com.springboot.authify.io;

import lombok.*;

@Getter
@AllArgsConstructor
public class AuthResponse {
    private String email;
    private String jwtToken;
}
