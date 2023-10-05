package com.example.emailVerificationPractice.Repository;

import com.example.emailVerificationPractice.Entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementRepository extends JpaRepository<AnnouncementRepository, Long> {


    Announcement findByuniqueNo(String uniqueNo);
    void deleteByuniqueNo();


}
