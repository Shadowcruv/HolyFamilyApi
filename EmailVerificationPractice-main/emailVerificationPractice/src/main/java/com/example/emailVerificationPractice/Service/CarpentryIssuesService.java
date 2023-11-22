package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.CarpentryIssues;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CarpentryIssuesService {

    List<CarpentryIssues> getCarpentryIssues();

    void deleteCarpentryIssue(Long id);
}
