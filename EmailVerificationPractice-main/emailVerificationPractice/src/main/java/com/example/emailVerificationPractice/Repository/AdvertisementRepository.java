package com.example.emailVerificationPractice.Repository;

import com.example.emailVerificationPractice.Entity.Advertisement;
import com.example.emailVerificationPractice.Entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {

    Advertisement findByuniqueNo(String uniqueNo);
    void deleteByuniqueNo();
}
