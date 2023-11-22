package com.example.emailVerificationPractice.Repository;

import com.example.emailVerificationPractice.Entity.WindowIssues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WindowRepository extends JpaRepository<WindowIssues,Long> {

}
