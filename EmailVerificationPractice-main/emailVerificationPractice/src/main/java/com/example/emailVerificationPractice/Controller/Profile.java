package com.example.emailVerificationPractice.Controller;


import com.example.emailVerificationPractice.Entity.ApiUser;
import com.example.emailVerificationPractice.Service.ApiServiceImpl;
import com.example.emailVerificationPractice.Service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/adminpage")
@RestController
public class Profile {

    private final ApiServiceImpl apiServiceImp;
    private final ImageService imageService;

    @Autowired
    public Profile(ApiServiceImpl apiServiceImp, ImageService imageService) {
        this.apiServiceImp = apiServiceImp;
        this.imageService = imageService;
    }

    //TODO: VIEW YOUR PROFILE
    //TODO: EDIT YOUR PROFILE
    //TODO: CHANGE YOUR PASSWORD

    @GetMapping("/view-profile")
    public ApiUser getCurrentUser(@AuthenticationPrincipal UserDetails userDetails){
       return apiServiceImp.retrieveUser(userDetails.getUsername());
    }

    @PutMapping("/update-profile")
    public void updateProfile(@AuthenticationPrincipal UserDetails userDetails,@RequestBody ApiUser apiUser){

       apiServiceImp.updateProfile(userDetails,apiUser);
       //studentService.save(originalStudent);

    }

    @PutMapping("/update-password")
    public void updatePassword(@AuthenticationPrincipal UserDetails userDetails,@RequestBody ApiUser apiUser){

        apiServiceImp.updatePassword(userDetails,apiUser);


    }


    //
    //
    @PostMapping("/upload")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
        try {
            imageService.uploadImage(file);
            return ResponseEntity.ok("Image uploaded successfully.");
        } catch (IOException e) {
            return ResponseEntity.badRequest().body("Failed to upload image: " + e.getMessage());
        }
    }


}
