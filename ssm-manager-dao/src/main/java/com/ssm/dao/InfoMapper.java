package com.ssm.dao;

import java.util.List;

import com.ssm.pojo.Info;

public interface InfoMapper extends BaseMapper<Info>{
	public List<Info> getAll();
	public void add(Info info);
	public Info getOne(String stuid);
	public void edit(Info info);
	public void deleteInfo(String stuid);
}
