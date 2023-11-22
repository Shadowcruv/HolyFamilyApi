package com.example.emailVerificationPractice.Controller;

import com.example.emailVerificationPractice.Entity.Advertisement;
import com.example.emailVerificationPractice.Entity.Event;
import com.example.emailVerificationPractice.Service.AdvertisementServiceImp;
import com.example.emailVerificationPractice.Service.AnnouncementServiceImp;
import com.example.emailVerificationPractice.Service.EventsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/admin-event-page")
@RestController
public class AdminWebPageEvent {

    private final AnnouncementServiceImp announcementServiceImp;
    private final AdvertisementServiceImp advertisementServiceImp;
    private final EventsServiceImpl eventsServiceImpl;

    @Autowired
    public AdminWebPageEvent(EventsServiceImpl eventsServiceImp, AnnouncementServiceImp announcementServiceImp, AdvertisementServiceImp advertisementServiceImp, EventsServiceImpl eventsServiceImpl) {
        this.announcementServiceImp = announcementServiceImp;
        this.advertisementServiceImp = advertisementServiceImp;
        this.eventsServiceImpl = eventsServiceImpl;
    }

    @GetMapping("/get-events")
    @PreAuthorize("hasAuthority('role_Admin')")
    public List<Event> getEvents(){
      return eventsServiceImpl.getEvents();
    }

    @PostMapping("/add-advertisement")
    @PreAuthorize("hasAuthority('role_Admin')")
    public void addAdvertisement(@RequestBody Advertisement advertisement){
        advertisementServiceImp.saveAdvertisement(advertisement);
    }

    @PostMapping("/add-event")
    @PreAuthorize("hasAuthority('role_Admin')")
    public void addEvent(@RequestBody Event event){
        eventsServiceImpl.saveEvent(event);
    }
}
