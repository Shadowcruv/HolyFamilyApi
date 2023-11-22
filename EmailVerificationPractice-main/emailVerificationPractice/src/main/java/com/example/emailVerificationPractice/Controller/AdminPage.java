package com.example.emailVerificationPractice.Controller;


import com.example.emailVerificationPractice.Entity.Announcement;
import com.example.emailVerificationPractice.Entity.ApiUser;
import com.example.emailVerificationPractice.Entity.Event;
import com.example.emailVerificationPractice.Service.AnnouncementServiceImp;
import com.example.emailVerificationPractice.Service.ApiServiceImpl;
import com.example.emailVerificationPractice.Service.EventsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/admin-page")
@RestController
public class AdminPage {

    private final ApiServiceImpl apiService;
    private final EventsServiceImpl eventServiceImp;
    private final AnnouncementServiceImp announcementServiceImp;

    @Autowired
    public AdminPage(ApiServiceImpl apiService, EventsServiceImpl eventService, EventsServiceImpl eventServiceImp, AnnouncementServiceImp announcementServiceImp) {
        this.apiService = apiService;
        this.eventServiceImp = eventServiceImp;
        this.announcementServiceImp = announcementServiceImp;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('role_Admin')")
    public List<ApiUser> retrieveApiUsersList(){
        List<ApiUser> apiUsers = apiService.retrieveUsers();
        return apiUsers;
    }
//    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_ADMINTRAINEE')")
//    @PreAuthorize("hasAnyAuthority
//
//
//    @GetMapping(path = "{studentUsername}")
//    @PreAuthorize("hasAnyAuthority('role_AdminTrainee')")
//    public ApiUser retrieveApiUser(@PathVariable("studentUsername") String username){
//        ApiUser apiUser = apiService.retrieveUser(username);
//        return apiUser;
//    }('role_AdminTrainee','role_Admin')")

    @GetMapping("/check")
    @PreAuthorize("hasAnyAuthority('role_AdminTrainee','role_Admin')")
    public String getStudentsPage(){
        return "You are an admin";
    }

    @GetMapping("/view-admin")
    public String viewAdmins(){
        return "view admins registered";
    }

    @PostMapping("/add-event")
    public void addEvent(@RequestBody Event event) {
         eventServiceImp.saveEvent(event);
    }

    @PostMapping("/admin")
    public void saveCApiUser(@RequestBody ApiUser apiUser){
        apiService.saveApiUser2(apiUser);
        System.out.println("Added Successfully");
    }

    @PostMapping("/add-announcement")
    public void addAnnouncement(@RequestBody Announcement announcement){
        announcementServiceImp.saveAnnouncement(announcement);
    }





    /*
    @PostMapping
    public void saveCApiUser(@RequestBody ApiUser apiUser){
     apiService.saveApiUser(apiUser);
        System.out.println("Added Successfully");
    }
    */

    @PostMapping("/update-api-user")
    public void saveUpdateApiUser(@RequestBody ApiUser apiUser){
        apiService.saveApiUser(apiUser);

        System.out.println("Updated Successfully");
    }

    /*
    //Confirming the token
    @GetMapping(path = "confirm")
    public String confirmToken(@RequestParam("token") String token){
        return apiService.confirmTokenn(token);
    }*/

//TODO: updating the user

    @PutMapping("/saveParticular/{id}")
    public ApiUser saveParticularStudent(@PathVariable Long id, @RequestBody ApiUser apiUser){

      return apiService.updateUser(id,apiUser);

        //studentService.save(originalStudent);

    }
    @PutMapping("/saveParticular/{email}")
    public ApiUser saveParticularStudent(@PathVariable String email, @RequestBody ApiUser apiUser){

       return apiService.updateUser(email,apiUser);

        //studentService.save(originalStudent);

    }
    @PutMapping("/updatetoadmin/{email}")
    public ApiUser UpdateParticularStudentRoleAdmin(@PathVariable String email){

        return apiService.updateUserRoleAdmin(email);

        //studentService.save(originalStudent);

    }  @PutMapping("/updateToAdminTrainee/{email}")
    public ApiUser UpdateParticularStudentRoleAdminTrainee(@PathVariable String email){

        return apiService.updateUserRoleAdminTrainee(email);

        //studentService.save(originalStudent);

    }  @PutMapping("/updateToUser/{email}")
    public ApiUser UpdateParticularStudentRoleStudent(@PathVariable String email){

        return apiService.updateUserRoleUser(email);

        //studentService.save(originalStudent);

    }



    @DeleteMapping(path = "{studentUsername}")
    @PreAuthorize("hasAnyAuthority('role_Admin')")
    public void deleteUser(@PathVariable("studentUsername") String username){

        apiService.deleteUser(username);
    }

    //TODO create implentation for sign out






}
