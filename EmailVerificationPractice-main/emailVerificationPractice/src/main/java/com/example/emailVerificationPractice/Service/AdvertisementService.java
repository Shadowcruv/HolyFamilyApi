package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.Advertisement;

import java.util.List;

public interface AdvertisementService {
    void saveAdvertisement(Advertisement announcement);
    Advertisement getAdvertisement(String uniqueNo);
    void deleteAdvertisement(String name);
    List<Advertisement> getAdvertisement();
}
