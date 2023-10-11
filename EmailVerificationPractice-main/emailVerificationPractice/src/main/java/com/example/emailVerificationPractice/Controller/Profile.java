package com.example.emailVerificationPractice.Controller;


import com.example.emailVerificationPractice.Entity.ApiUser;
import com.example.emailVerificationPractice.Service.ApiServiceImpl;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/adminpage")
@RestController
public class Profile {

    private final ApiServiceImpl apiServiceImp;

    public Profile(ApiServiceImpl apiServiceImp) {
        this.apiServiceImp = apiServiceImp;
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


}
