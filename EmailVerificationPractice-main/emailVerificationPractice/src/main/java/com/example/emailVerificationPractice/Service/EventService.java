package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.Event;

import java.util.List;

public interface EventService {

    void saveEvent(Event event);
    Event getEvent(String uniqueNo);
    void deleteEvent(String name);
    List<Event> getEvents();

}
