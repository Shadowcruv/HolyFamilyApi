package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.AdSuscriber;
import com.example.emailVerificationPractice.Repository.AdSuscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdSuscriberServiceImpl implements AdSuscriberService{

    private final AdSuscriberRepository adSuscriberRepository;


    public AdSuscriberServiceImpl(AdSuscriberRepository adSuscriberRepository) {
        this.adSuscriberRepository = adSuscriberRepository;
    }

    @Override
    public List<AdSuscriber> retrieveAdSuscribersS() {
        return adSuscriberRepository.findAll();
    }
}
