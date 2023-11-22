package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.Advertisement;
import com.example.emailVerificationPractice.Repository.AdvertisementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdvertisementServiceImp implements AdvertisementService{

    private final AdvertisementRepository advertisementRepository;

    public AdvertisementServiceImp(AdvertisementRepository advertisementRepository) {
        this.advertisementRepository = advertisementRepository;
    }

    @Override
    public void saveAdvertisement(Advertisement advertisement) {
        advertisementRepository.save(advertisement);
    }

    @Override
    public Advertisement getAdvertisement(String uniqueNo) {
        return advertisementRepository.findByuniqueNo(uniqueNo);
    }

    @Override
    public void deleteAdvertisement(String name) {

    }

    @Override
    public List<Advertisement> getAdvertisement() {
        return null;
    }
}
