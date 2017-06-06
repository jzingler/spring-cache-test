package io.pivotal.service;

import org.springframework.stereotype.Service;

import io.pivotal.domain.Cache;

@Service
public class CacheDataServiceImpl implements ICacheDataService {
	
	@Override
	public Cache getCacheTest(long id) {
		simulateSlowService();
		return null;
	}
	
	@Override
    public void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

	@Override
	public Cache getCacheTestWithNull(long id) {
		simulateSlowService();
		return null;
	}

}
