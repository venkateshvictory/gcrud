package com.trainee.trainee.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trainee.trainee.entity.TraineeModel;
import com.trainee.trainee.service.TraineeService;

@RestController
@RequestMapping("/api")
public class TraineeController {

	
	@Resource(name="traineeService")
	private TraineeService traineeService;
	@PostMapping("/create")
	public TraineeModel create(@RequestBody TraineeModel traineeModel) {
		return traineeService.save(traineeModel);
		
	}
}
