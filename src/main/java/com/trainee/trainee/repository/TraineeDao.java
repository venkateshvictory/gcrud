package com.trainee.trainee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainee.trainee.entity.TraineeModel;

@Repository("traineeDao")
public interface TraineeDao extends JpaRepository<TraineeModel, Long> {

}
