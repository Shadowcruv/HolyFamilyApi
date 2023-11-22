package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.PlumbingIssues;
import com.example.emailVerificationPractice.Repository.PlumbingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlumbingIssuesServiceImp implements PlumbingIssuesService{

    private final PlumbingRepository plumbingRepository;

    public PlumbingIssuesServiceImp(PlumbingRepository plumbingRepository) {
        this.plumbingRepository = plumbingRepository;
    }

    @Override
    public List<PlumbingIssues> getPlumbingIssues() {
        return plumbingRepository.findAll() ;
    }

    @Override
    public void deletePlumbingIssues(Long id) {
        plumbingRepository.deleteById(id);
    }
}
