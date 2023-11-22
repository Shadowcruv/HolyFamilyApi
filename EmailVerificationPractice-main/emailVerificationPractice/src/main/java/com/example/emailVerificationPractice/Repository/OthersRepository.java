package com.example.emailVerificationPractice.Repository;

import com.example.emailVerificationPractice.Entity.Others;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OthersRepository extends JpaRepository<Others, Long> {
}
