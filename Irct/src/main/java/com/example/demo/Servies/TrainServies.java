package com.example.demo.Servies;

import java.util.List;

import com.example.demo.Entity.Train;

public interface TrainServies {

	void addTrain(Train train );
	Train getTrain(int id);
	List<Train> getTrain();
}
