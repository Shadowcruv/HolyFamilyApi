package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.CarpentryIssues;
import com.example.emailVerificationPractice.Repository.CarpentryRepository;

import java.util.List;

public class CarpentryIssuesServiceImp implements CarpentryIssuesService{

    private final CarpentryRepository carpentryRepository;

    public CarpentryIssuesServiceImp(CarpentryRepository carpentryRepository) {
        this.carpentryRepository = carpentryRepository;
    }

    public List<CarpentryIssues> getCarpentryIssues(){
        return carpentryRepository.findAll();
    }

    public void deleteCarpentryIssue(Long id){
        carpentryRepository.deleteById(id);
    }
}
