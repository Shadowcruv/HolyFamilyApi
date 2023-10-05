package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.CarpentryIssues;

import java.util.List;

public interface CarpentryIssuesService {

    List<CarpentryIssues> getCarpentryIssues();

    void deleteCarpentryIssue(Long id);
}
