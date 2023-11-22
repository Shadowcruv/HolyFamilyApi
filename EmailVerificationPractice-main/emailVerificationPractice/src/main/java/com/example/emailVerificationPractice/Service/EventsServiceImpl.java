package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.Event;
import com.example.emailVerificationPractice.Repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventsServiceImpl implements EventService{

    private final EventRepository eventRepository;

    public EventsServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public void saveEvent(Event event) {
        eventRepository.save(event);
    }

    @Override
    public Event getEvent(String uniqueNo) {
        return eventRepository.findByuniqueNo(uniqueNo);
    }

    @Override
    public void deleteEvent(String uniqueNo) {
      eventRepository.deleteByuniqueNo(uniqueNo);
    }

    @Override
    public List<Event> getEvents() {
        return eventRepository.findAll();
    }
}
