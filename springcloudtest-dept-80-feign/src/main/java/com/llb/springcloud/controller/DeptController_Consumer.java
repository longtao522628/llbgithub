package com.llb.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.llb.springcloud.entities.Dept;
import com.llb.springcloud.entities.service.DeptClientService;

@RestController
public class DeptController_Consumer {

	  @Autowired
	  private RestTemplate restTemplate;
	
	  @Autowired
	  private DeptClientService service = null;
	  
	  //private static final String REST_URL_PREFIX = "http://localhost:8001";
	  private static final String REST_URL_PREFIX = "http://SPRINGCLOUDTEST-DEPT";
	 
	  @RequestMapping(value = "/consumer/dept/get/{id}")
	  public Dept get(@PathVariable("id") Long id)
	  {
	   return this.service.get(id);
	  }
	 
	  @RequestMapping(value = "/consumer/dept/list")
	  public List<Dept> list()
	  {
	   return this.service.list();
	  }
	 
	  @RequestMapping(value = "/consumer/dept/add")
	  public Object add(Dept dept)
	  {
	   return this.service.add(dept);
	  }

	
     //测试@EnableDiscoveryClient,消费端可以调用服务发现
     @RequestMapping(value="/consumer/dept/discovery") 
     public Object discovery()
     {
         return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery", Object.class);
     } 
	
}
