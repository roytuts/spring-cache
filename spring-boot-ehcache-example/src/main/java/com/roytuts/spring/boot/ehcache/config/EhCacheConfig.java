package com.roytuts.spring.boot.ehcache.config;

import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.springframework.cache.CacheManager;

//@Configuration
public class EhCacheConfig {

	// @Bean
	public CacheManager ehcacheManager() {
		CacheManager cacheManager = (CacheManager) CacheManagerBuilder.newCacheManagerBuilder()
				.withCache("emloyee", CacheConfigurationBuilder
						.newCacheConfigurationBuilder(Long.class, String.class, ResourcePoolsBuilder.heap(100)).build())
				.build(true);
		return cacheManager;
	}

}
