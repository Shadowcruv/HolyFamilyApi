package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.WindowIssues;
import com.example.emailVerificationPractice.Repository.WindowRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WindowIssuesServiceImp implements WindowIssuesService{

    private final WindowRepository windowRepository;

    public WindowIssuesServiceImp(WindowRepository windowRepository) {
        this.windowRepository = windowRepository;
    }

    @Override
    public List<WindowIssues> getWindowIssues() {
        return windowRepository.findAll();
    }

    @Override
    public void deleteWindowIssues(Long id) {
        windowRepository.deleteById(id);
    }
}
