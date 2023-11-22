package com.example.emailVerificationPractice.Controller;


import com.example.emailVerificationPractice.Entity.ApiUser;
import com.example.emailVerificationPractice.Entity.DatabaseExcluded.UserPassword;
import com.example.emailVerificationPractice.Service.ApiServiceImpl;
//import com.example.emailVerificationPractice.Service.ImageService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/profile")
@RestController
public class ProfileWebPage {

    private final ApiServiceImpl apiServiceImp;

    public ProfileWebPage(ApiServiceImpl apiServiceImp) {
        this.apiServiceImp = apiServiceImp;
    }
//    private final ImageService imageService;

//    @Autowired
//    public Profile(ApiServiceImpl apiServiceImp, ImageService imageService) {
//        this.apiServiceImp = apiServiceImp;
//        this.imageService = imageService;
//    }

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
    public void updatePassword(@AuthenticationPrincipal UserDetails userDetails, @RequestBody UserPassword userPassword){

        apiServiceImp.updatePassword(userDetails, userPassword);
    }


    //
    //
//    @PostMapping("/upload")
//    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
//        try {
//            imageService.uploadImage(file);
//            return ResponseEntity.ok("Image uploaded successfully.");
//        } catch (IOException e) {
//            return ResponseEntity.badRequest().body("Failed to upload image: " + e.getMessage());
//        }
//    }


}
