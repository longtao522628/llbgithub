package com.llb.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//@Configurable注解标注此类为一个配置类，

@Configuration
public class ConfigBean {

	/*
	   标注了@Configurable注解后
	   下面这个方法相当于我们application.xml文件中的
	 <bean id="UserServcer" class="com.llb.servcer.UserServcerImpl">
	*/
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
