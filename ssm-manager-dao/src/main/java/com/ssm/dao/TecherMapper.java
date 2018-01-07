package com.ssm.dao;

import java.util.List;

import com.ssm.pojo.Techer;

public interface TecherMapper extends BaseMapper<Techer>{
	
	public List<Techer> getAll();
	public void addtecher(Techer techer);
	public Techer getOne(String techid);
	public void edit(Techer techer);
	public void deleteTecher(String techid);
}
