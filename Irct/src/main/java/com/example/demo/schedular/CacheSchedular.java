package com.example.demo.schedular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.Cache.Cache;
@Component
@EnableScheduling
public class CacheSchedular {

	@Autowired
	Cache cache;

@Scheduled(fixedDelay = 5000)
	public void execute()
	{
	cache.clearCache();
		cache.fechdatafromdb();

	}
	
}
