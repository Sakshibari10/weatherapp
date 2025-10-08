package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Train;
@Repository
public interface TrainRepo extends JpaRepository<Train , Integer> {

}
