package com.example.emailVerificationPractice.Controller;

import com.example.emailVerificationPractice.Entity.AdSuscriber;
import com.example.emailVerificationPractice.Entity.Announcement;
import com.example.emailVerificationPractice.Entity.ApiUser;
import com.example.emailVerificationPractice.Service.AdSuscriberServiceImpl;
import com.example.emailVerificationPractice.Service.AnnouncementServiceImp;
import com.example.emailVerificationPractice.Service.ApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5501")
@RequestMapping("/admin-general-page")
@RestController
public class AdminWebPageGeneral {

    private final ApiServiceImpl apiService;
    private final AnnouncementServiceImp announcementServiceImp;
    private final AdSuscriberServiceImpl adSuscriberService;

    @Autowired
    public AdminWebPageGeneral(ApiServiceImpl apiService, AnnouncementServiceImp announcementServiceImp, AdSuscriberServiceImpl adSuscriberService) {
        this.apiService = apiService;
        this.announcementServiceImp = announcementServiceImp;
        this.adSuscriberService = adSuscriberService;
    }

    //TODO List<ApiUser> retrieveUsersAdminRoleC

//    @GetMapping("/get-admin-users")
//    @PreAuthorize("hasAuthority('role_Admin')")
//    public List<ApiUser> retrieveUsersAdminRoleC(){
//        List<ApiUser> apiUsers = apiService.retrieveUsersAdminRoleS();
//        return apiUsers;
//    }

    @GetMapping("/get-adsuscribers")
    @PreAuthorize("hasAuthority('role_Admin')")
    public List<AdSuscriber> retrieveAdSuscribers(){
        List<AdSuscriber> adSuscribers = adSuscriberService.retrieveAdSuscribersS();
        return adSuscribers;
    }

    @PostMapping("/add-announcement")
    @PreAuthorize("hasAuthority('role_Admin')")
    public void addAdvertisement(@RequestBody Announcement announcement){
        announcementServiceImp.saveAnnouncement(announcement);
    }

    //TODO write method to return current user in session
    // (i.e) user that is currently signed in
}
