package com.springboot.authify.io;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProfileRequest {
    @NotBlank(message = "Name should not be empty")
    private String name;

    @Email(message = "Email must be valid")
    @NotBlank(message = "Email should not be empty")
    private String email;

    @Size(min = 6, message = "Password must be at least 6 characters")
    private String password;
}
