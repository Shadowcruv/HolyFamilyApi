package com.example.emailVerificationPractice.Repository;

import com.example.emailVerificationPractice.Entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {


    Announcement findByuniqueNo(String uniqueNo);
    void deleteByuniqueNo(String uniqueNo);


}
