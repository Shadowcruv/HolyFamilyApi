package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.Others;
import com.example.emailVerificationPractice.Repository.OthersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OthersServiceImp implements OthersService{

    private final OthersRepository othersRepository;

    public OthersServiceImp(OthersRepository othersRepository) {
        this.othersRepository = othersRepository;
    }

    @Override
    public List<Others> getOthersIssues() {
        return othersRepository.findAll();
    }

    @Override
    public void deleteOthersIssues(Long id) {
        othersRepository.findAll();
    }
}
