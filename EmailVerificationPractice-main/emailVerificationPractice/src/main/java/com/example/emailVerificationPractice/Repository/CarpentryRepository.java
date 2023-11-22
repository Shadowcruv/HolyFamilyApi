package com.example.emailVerificationPractice.Repository;

import com.example.emailVerificationPractice.Entity.CarpentryIssues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarpentryRepository extends JpaRepository<CarpentryIssues,Long> {

}
