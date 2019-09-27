package com.llb.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.llb.springcloud.entities.Dept;

@Mapper  //一定要有此注解
public interface DeptDao {
	
	public boolean addDept(Dept dept);
	 
	public Dept findById(Long id);
	 
	public List<Dept> findAll();

}
