package com.example.demo.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Entity.Train;
import com.example.demo.Repo.TrainRepo;
import com.example.demo.Servies.TrainServieimp;

@SpringBootTest
public class TrainServieimpTest {


	@InjectMocks
	TrainServieimp  Servieimp;
	
	@Mock
	TrainRepo trainRepo;
	
	
	@Test
	public void addTrainTest()
	{
		Train t = new Train();
		    t.setId(1);
		    t.setTrainName("train1");
		    t.setTime("12.00");
		    t.setdest("pune");
     	    t.setSource("jalgaon");
		    
     	   when(trainRepo.save(any(Train.class))).thenReturn(null);

     	    
		Servieimp.addTrain(t);
		
		
	}
}
