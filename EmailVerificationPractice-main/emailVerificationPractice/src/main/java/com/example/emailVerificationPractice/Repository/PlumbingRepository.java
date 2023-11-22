package com.example.emailVerificationPractice.Repository;

import com.example.emailVerificationPractice.Entity.PlumbingIssues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlumbingRepository extends JpaRepository<PlumbingIssues,Long> {

}
