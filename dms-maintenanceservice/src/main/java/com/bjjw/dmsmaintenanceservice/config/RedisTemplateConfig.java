package com.bjjw.dmsmaintenanceservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisTemplateConfig {
    //order
    @Value("${spring.redis1.host}")
    private String redis1Host;

    @Value("${spring.redis1.port}")
    private String redis1Port;

    @Value("${spring.redis1.password}")
    private String redis1Password;

    //user
    @Value("${spring.redis2.host}")
    private String redis2Host;

    @Value("${spring.redis2.port}")
    private String redis2Port;

    @Value("${spring.redis2.password}")
    private String redis2Password;

    private static final int MAX_IDLE = 200; //最大空闲连接数
    private static final int MAX_TOTAL = 1024; //最大连接数
    private static final long MAX_WAIT_MILLIS = 10000; //建立连接最长等待时间


    //配置工厂
    public RedisConnectionFactory connectionFactory(String host, int port, String password, int maxIdle,
                                                    int maxTotal, long maxWaitMillis, int index) {
        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
        jedisConnectionFactory.setHostName(host);
        jedisConnectionFactory.setPort(port);

        if (!StringUtils.isEmpty(password)) {
            jedisConnectionFactory.setPassword(password);
        }

        if (index != 0) {
            jedisConnectionFactory.setDatabase(index);
        }

        jedisConnectionFactory.setPoolConfig(poolConfig(maxIdle, maxTotal, maxWaitMillis, false));
        jedisConnectionFactory.afterPropertiesSet();
        return jedisConnectionFactory;
    }

    //连接池配置
    public JedisPoolConfig poolConfig(int maxIdle, int maxTotal, long maxWaitMillis, boolean testOnBorrow) {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(maxIdle);
        poolConfig.setMaxTotal(maxTotal);
        poolConfig.setMaxWaitMillis(maxWaitMillis);
        poolConfig.setTestOnBorrow(testOnBorrow);
        return poolConfig;
    }


    //------------------------------------
    @Bean(name = "redis1Template")
    public StringRedisTemplate redis1Template() {
        StringRedisTemplate template = new StringRedisTemplate();
        template.setConnectionFactory(
                connectionFactory(redis1Host, Integer.parseInt(redis1Port), redis1Password, MAX_IDLE, MAX_TOTAL, MAX_WAIT_MILLIS, 0));
        return template;
    }

    //------------------------------------
    @Bean(name = "redis2Template")
    public StringRedisTemplate redis2Template() {
        StringRedisTemplate template = new StringRedisTemplate();
        template.setConnectionFactory(
                connectionFactory(redis2Host, Integer.parseInt(redis2Port), redis2Password, MAX_IDLE, MAX_TOTAL, MAX_WAIT_MILLIS, 0));
        return template;
    }
}