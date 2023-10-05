package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.ElectricalIssues;
import com.example.emailVerificationPractice.Entity.Others;

import java.util.List;

public interface OthersService {

    List<Others> getOthersIssues();

    void deleteOthersIssues(Long id);
}
