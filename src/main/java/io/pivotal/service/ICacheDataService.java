package io.pivotal.service;

import org.springframework.cache.annotation.Cacheable;

import io.pivotal.domain.Cache;

public interface ICacheDataService {
	
	@Cacheable(cacheNames="testCache" )
	Cache getCacheTest(long id);
	
	@Cacheable(cacheNames="testCacheUnlessEqNull", unless="null")
	Cache getCacheTestWithNull(long id);
	
	void simulateSlowService();

}
