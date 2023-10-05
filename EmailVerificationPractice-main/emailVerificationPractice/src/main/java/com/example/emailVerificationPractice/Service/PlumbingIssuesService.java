package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.PlumbingIssues;

import java.util.List;

public interface PlumbingIssuesService {

    List<PlumbingIssues> getPlumbingIssues();

    void deletePlumbingIssues(Long id);
}
