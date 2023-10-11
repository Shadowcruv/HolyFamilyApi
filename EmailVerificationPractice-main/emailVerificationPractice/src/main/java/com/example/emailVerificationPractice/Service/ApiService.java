package com.example.emailVerificationPractice.Service;


import com.example.emailVerificationPractice.Entity.ApiUser;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface ApiService {
    void saveApiUser(ApiUser apiUser);
    ApiUser retrieveUser(String username);
    List<ApiUser> retrieveUsers();
    void  deleteUser(String username);

    void updateProfile(UserDetails userDetails, ApiUser apiUser);

    void updatePassword(UserDetails userDetails, ApiUser apiUser);

    String confirmTokenn(String token);
}
