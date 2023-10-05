package com.example.emailVerificationPractice.Controller;

import com.example.emailVerificationPractice.Entity.Advertisement;
import com.example.emailVerificationPractice.Entity.Event;
import com.example.emailVerificationPractice.Service.AdvertisementServiceImp;
import com.example.emailVerificationPractice.Service.AnnouncementServiceImp;
import com.example.emailVerificationPractice.Service.EventsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/adminpage")
@RestController
public class AdminEventPage {

    private final EventsServiceImpl eventsServiceImp;
    private final AnnouncementServiceImp announcementServiceImp;

    private final AdvertisementServiceImp advertisementServiceImp;

    @Autowired
    public AdminEventPage(EventsServiceImpl eventsService, EventsServiceImpl eventsServiceImp, AnnouncementServiceImp announcementServiceImp, AdvertisementServiceImp advertisementServiceImp) {
        this.eventsServiceImp = eventsServiceImp;

        this.announcementServiceImp = announcementServiceImp;
        this.advertisementServiceImp = advertisementServiceImp;
    }

    public List<Event> getEvents(){
      return eventsServiceImp.getEvents();
    }

    @PostMapping("/add-advertisement")
    public void addAdvertisement(@RequestBody Advertisement advertisement){
        advertisementServiceImp.saveAdvertisement(advertisement);
    }
}
