package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.ElectricalIssues;

import java.util.List;

public interface ElectricalIssuesService{

    List<ElectricalIssues> getElectricalIssues();

    void deleteElectricalIssues(Long id);


}
