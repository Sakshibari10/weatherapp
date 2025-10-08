package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CustomException.IrctException;
import com.example.demo.Entity.Train;
import com.example.demo.Servies.TrainServies;

@RestController
public class TrainController {

	@Autowired
	TrainServies servies;

	@PostMapping("/train")
	public ResponseEntity addTrain(@RequestBody Train train) {
		
			servies.addTrain(train);
			return new ResponseEntity("train add", HttpStatus.CREATED);

		
	}

	@GetMapping("train/{id}")
	public Train getTrainDetails(@PathVariable("id") int id) {
		return servies.getTrain(id);

	}

	@GetMapping("/trains")
	public List<Train> getAllTrain() {
		return servies.getTrain();
	}

}
