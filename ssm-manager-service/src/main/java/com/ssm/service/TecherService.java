package com.ssm.service;

import java.util.List;

import com.ssm.pojo.Techer;

public interface TecherService {
	public List<Techer> getAll();
	public void addtecher(Techer techer);
	public Techer getOne(String techid);
	public void edit(Techer techer);
	public void deleteTecher(String techid);
}