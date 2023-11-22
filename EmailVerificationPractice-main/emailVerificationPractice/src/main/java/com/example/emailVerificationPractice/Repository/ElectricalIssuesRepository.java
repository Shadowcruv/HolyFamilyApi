package com.example.emailVerificationPractice.Repository;

import com.example.emailVerificationPractice.Entity.ElectricalIssues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectricalIssuesRepository extends JpaRepository<ElectricalIssues, Long> {

}
