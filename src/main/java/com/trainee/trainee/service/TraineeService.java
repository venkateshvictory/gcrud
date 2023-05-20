package com.trainee.trainee.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.trainee.trainee.entity.TraineeModel;
import com.trainee.trainee.repository.TraineeDao;

@Service("traineeService")
public class TraineeService {

	@Resource(name="traineeDao")
	private TraineeDao traineeDoo;
	
	public TraineeModel save(TraineeModel traineeModel) {
		return traineeDoo.save(traineeModel);
	}
}
