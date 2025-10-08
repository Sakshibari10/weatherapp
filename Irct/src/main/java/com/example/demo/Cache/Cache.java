package com.example.demo.Cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Train;
import com.example.demo.Repo.TrainRepo;

@Component
public class Cache {
	
	private Cache()
	{}

@Autowired
TrainRepo repo;
	
	Map<Integer,Train > m=new HashMap<>();
	
	public void fechdatafromdb()
	{
		List<Train> l =repo.findAll();
		
		for (Train t:l) {
			m.put(t.getId(),t);
			{
				
			}
		}
				
		
		
	}
	
	public boolean check(int id)
	{
		return m.containsKey(id);
    }
	
	public void storeData(Train train)
	{
		System.out.println(" store data in cache"+ train.getTrainName());
		m.put(train.getId(), train);
	}
	
	public Train getCachedata(int id)
	{
		return m.get(id);
		
	}
	
	public void clearCache()
	{
		m.clear();
	}
	
}