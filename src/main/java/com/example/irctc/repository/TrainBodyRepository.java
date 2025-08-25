package com.example.irctc.repository;

import com.example.irctc.entity.TrainBody;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainBodyRepository extends JpaRepository<TrainBody,Long> {
}
