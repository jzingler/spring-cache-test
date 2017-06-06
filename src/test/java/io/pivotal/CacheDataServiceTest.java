package io.pivotal;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StopWatch;

import io.pivotal.domain.Cache;
import io.pivotal.service.ICacheDataService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CacheDataServiceTest {
	
	@Autowired
	ICacheDataService cacheDataService;
	
	
	@Test
	public void whenGetCacheTwiceThenTotalTimeLessThanFourSecs() {
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Cache cache1 = cacheDataService.getCacheTest(123L);
		Cache cache2 = cacheDataService.getCacheTest(123L);		
		stopWatch.stop();
		Assert.assertTrue(stopWatch.getTotalTimeSeconds() < 4);  //Each call to getCacheTest includes a 3 second timeout
		Assert.assertEquals(cache1, cache2);
	}
	
	@Test(expected=NullPointerException.class)
	public void whenGetCacheWithNullTwiceThenNull() {
		cacheDataService.getCacheTestWithNull(123L);
		cacheDataService.getCacheTestWithNull(123L);		
	}

}
