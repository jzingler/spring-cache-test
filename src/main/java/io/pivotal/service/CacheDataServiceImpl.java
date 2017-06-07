package io.pivotal.service;

import org.springframework.stereotype.Service;

import io.pivotal.domain.Comment;

@Service
public class CacheDataServiceImpl implements ICacheDataService {

	@Override
	public Comment getCacheTest(long id) {
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
	public Comment getCacheTestWithNull(long id) {
		simulateSlowService();
		return null;
	}

	@Override
	public Comment putCacheTest(long id) {
		return new Comment(id);
	}

}
