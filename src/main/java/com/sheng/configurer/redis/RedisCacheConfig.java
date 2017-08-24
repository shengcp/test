package com.sheng.configurer.redis;

import java.lang.reflect.Method;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

/**
 * 
* @ClassName: RedisCacheConfig 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author single
* @date 2017年6月2日 下午5:44:25 
*
 */
@Configuration
@EnableCaching //启用缓存
public class RedisCacheConfig extends CachingConfigurerSupport {

	@Override
	public KeyGenerator keyGenerator() {
		
		return new KeyGenerator() {
			
			@Override
			public Object generate(Object target, Method method, Object... params) {
				 StringBuilder sb = new StringBuilder();
		            sb.append(target.getClass().getName());
		            sb.append(method.getName());
		            for (Object obj : params) {
		                sb.append(obj.toString());
		            }
		            return sb.toString();
			}
		};
	}
	
	
	/**
	 */
	@Bean
	public CacheManager redisCacheManager(@SuppressWarnings("rawtypes") RedisTemplate redisTemplate){
		return new RedisCacheManager(redisTemplate);
	}
	
	@Bean
	public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory){
		 RedisTemplate<String, String> redisTemplate= new RedisTemplate<>();
		 redisTemplate.setConnectionFactory(factory);
		 Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<>(Object.class);  
		 redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);//设置序列化
		 redisTemplate.setKeySerializer(jackson2JsonRedisSerializer);
		 return redisTemplate;
	}
}
