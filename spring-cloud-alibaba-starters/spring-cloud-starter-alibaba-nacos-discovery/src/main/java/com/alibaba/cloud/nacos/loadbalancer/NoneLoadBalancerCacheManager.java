/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.cloud.nacos.loadbalancer;

import java.util.Collection;

import org.springframework.cache.Cache;
import org.springframework.cloud.loadbalancer.cache.LoadBalancerCacheManager;

/**
 * Don't cache.<br>
 * <br>
 * 1. LoadBalancerCache causes information such as the weight of the service instance to
 * be changed without immediate effect.<br>
 * 2. Nacos itself supports caching.
 *
 * @author XuDaojie
 * @since 2021.1
 */
public class NoneLoadBalancerCacheManager implements LoadBalancerCacheManager {

	@Override
	public Cache getCache(String name) {
		return null;
	}

	@Override
	public Collection<String> getCacheNames() {
		return null;
	}
}
