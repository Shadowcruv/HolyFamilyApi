package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.WindowIssues;

import java.util.List;

public interface WindowIssuesService {
    List<WindowIssues> getWindowIssues();

    void deleteWindowIssues(Long id);
}
