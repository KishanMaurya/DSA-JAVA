package com.springboot.authify.service;

import com.springboot.authify.io.ProfileRequest;
import com.springboot.authify.io.ProfileResponse;

public interface ProfileService {
    ProfileResponse createProfile(ProfileRequest request);
    ProfileResponse getProfile(String email);
    void sendResetOtp(String email);
    void resetPassword(String email, String otp, String newPassword);
    void sendOtp(String email);
    void verifyOtp(String email, String otp);
    String getLoggedInUsers(String email);

}
