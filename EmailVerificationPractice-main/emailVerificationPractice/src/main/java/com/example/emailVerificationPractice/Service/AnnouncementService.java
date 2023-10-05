package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.Announcement;
import com.example.emailVerificationPractice.Entity.Event;

import java.util.List;

public interface AnnouncementService{

    void saveAnnouncement(Announcement announcement);
    Announcement getAnnouncement(String uniqueNo);
    void deleteAnnouncement(String name);
    List<Announcement> getAnnouncements();
}
