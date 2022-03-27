package com.example.demo.reps;

import com.example.demo.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepo extends JpaRepository<Phone, Long> {
}
