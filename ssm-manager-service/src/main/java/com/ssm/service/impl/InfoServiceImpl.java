package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.InfoMapper;
import com.ssm.pojo.Info;
import com.ssm.service.InfoService;


@Service("infoService")
public class InfoServiceImpl implements InfoService {
	
	@Autowired
	private InfoMapper infoMapper;

	@Override
	public int insert(Info entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Info entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Info entity) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Info select(Info entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Info> getAll() {
		// TODO Auto-generated method stub
		return infoMapper.getAll();
	}
	
	@Override
	public void add(Info info) {
		infoMapper.add(info);
	}
	
	@Override
	public Info getOne(String stuid) {
		return infoMapper.getOne(stuid);
	}
	
	@Override
	public void edit(Info info) {
		infoMapper.edit(info);
	}
	
	@Override
	public void deleteInfo(String stuid) {
		infoMapper.deleteInfo(stuid);
	}
}
