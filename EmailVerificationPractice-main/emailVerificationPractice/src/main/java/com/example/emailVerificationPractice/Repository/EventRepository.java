package com.example.emailVerificationPractice.Repository;

import com.example.emailVerificationPractice.Entity.ApiUser;
import com.example.emailVerificationPractice.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

  Event findByuniqueNo(String uniqueNo);
  void deleteByuniqueNo(String uniqueNo);

}
