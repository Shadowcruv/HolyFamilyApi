package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.Announcement;
import com.example.emailVerificationPractice.Entity.Event;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnnouncementServiceImp implements AnnouncementService{
    @Override
    public void saveAnnouncement(Announcement announcement) {

    }

    @Override
    public Announcement getAnnouncement(String uniqueNo) {
        return null;
    }

    @Override
    public void deleteAnnouncement(String uniqueNo) {

    }

    @Override
    public List<Announcement> getAnnouncements() {
        return null;
    }
}
