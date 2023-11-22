package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.ElectricalIssues;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ElectricalIssuesService{

    List<ElectricalIssues> getElectricalIssues();

    void deleteElectricalIssues(Long id);


}
