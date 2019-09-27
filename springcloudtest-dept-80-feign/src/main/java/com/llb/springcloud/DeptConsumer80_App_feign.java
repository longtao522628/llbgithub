package com.llb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.llb.springcloud"})
@ComponentScan("com.llb.springcloud")
public class DeptConsumer80_App_feign {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptConsumer80_App_feign.class, args);
	}


}
