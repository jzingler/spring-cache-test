package io.pivotal.service;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import io.pivotal.domain.Comment;

public interface ICacheDataService {
	
	@Cacheable(cacheNames="testCache" )
	Comment getCacheTest(long id);
	
	@Cacheable(cacheNames="testCacheUnlessEqNull", unless="#result==null")
	Comment getCacheTestWithNull(long id);
	
	@CachePut(cacheNames="testCacheUnlessEqNull")
	Comment putCacheTest(long id);
	
	void simulateSlowService();

}
