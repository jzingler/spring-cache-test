package io.pivotal.service;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import io.pivotal.domain.Cache;

public interface ICacheDataService {
	
	@Cacheable(cacheNames="testCache" )
	Cache getCacheTest(long id);
	
	@Cacheable(cacheNames="testCacheUnlessEqNull", unless="#result==null")
	Cache getCacheTestWithNull(long id);
	
	@CachePut(cacheNames="testCacheUnlessEqNull", key="#id")
	Cache putCacheTest(long id);
	
	void simulateSlowService();

}
