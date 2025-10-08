package com.example.demo.Servies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.Cache.Cache;
import com.example.demo.CustomException.IrctException;
import com.example.demo.Entity.Train;
import com.example.demo.Repo.TrainRepo;
@Service
public class TrainServieimp implements TrainServies {

	@Autowired
	TrainRepo repo;
	
	@Autowired
	Cache cache;
	
	@Override
	public void addTrain(Train train) {
		
		if(train.getId()<1000)
		{
			throw new IrctException("invalid train id",HttpStatus.BAD_REQUEST);
		}
		
		if(repo.existsById(train.getId()))
		{
			throw new IrctException(" train id already exist",HttpStatus.CONFLICT);
		}
		repo.save(train);
		
	}

	@Override
	public Train getTrain(int id) {
	
		if(cache.check(id))
		{
			System.out.println("data geting from cache");
			return cache.getCachedata(id);
		}
		System.out.println("data geting from dababase");
	Train t=	repo.findById(id).get();
	cache.storeData(t);
		return t;
	}

	@Override
	public List<Train> getTrain() {
	
		return repo.findAll();
	}

}
