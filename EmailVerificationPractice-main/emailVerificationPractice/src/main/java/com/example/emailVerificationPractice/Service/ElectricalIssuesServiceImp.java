package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.ElectricalIssues;
import com.example.emailVerificationPractice.Repository.ElectricalIssuesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ElectricalIssuesServiceImp implements ElectricalIssuesService{

    private final ElectricalIssuesRepository electricalIssuesRepository;

    public ElectricalIssuesServiceImp(ElectricalIssuesRepository electricalIssuesRepository) {
        this.electricalIssuesRepository = electricalIssuesRepository;
    }

    @Override
    public List<ElectricalIssues> getElectricalIssues() {

        return electricalIssuesRepository.findAll();
    }

    @Override
    public void deleteElectricalIssues(Long id) {
        electricalIssuesRepository.deleteById(id);
    }
}
