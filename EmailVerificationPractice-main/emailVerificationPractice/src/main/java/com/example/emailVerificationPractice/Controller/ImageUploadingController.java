package com.example.emailVerificationPractice.Controller;

import com.example.emailVerificationPractice.Service.ImageUploadingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/image")
public class ImageUploadingController {

    private final ImageUploadingService imageUploadingService;

    @Autowired
    public ImageUploadingController(ImageUploadingService imageUploadingService) {
        this.imageUploadingService = imageUploadingService;
    }

    @PostMapping
    public String upload(@RequestParam("file") MultipartFile multipartFile) {
        return imageUploadingService.upload(multipartFile);
    }

}
