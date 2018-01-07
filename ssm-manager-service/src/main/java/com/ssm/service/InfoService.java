package com.ssm.service;

import java.util.List;

import com.ssm.pojo.Info;

public interface InfoService extends BaseService<Info>{
	public List<Info> getAll();
	public void add(Info info);
	public Info getOne(String stuid);
	public void edit(Info info);
	public void deleteInfo(String stuid);
}
