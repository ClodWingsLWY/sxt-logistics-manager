package com.sxt.service;

import java.util.List;

import org.springframework.ui.Model;

import com.github.pagehelper.PageInfo;
import com.sxt.dto.BasicDataDto;
import com.sxt.pojo.BasicData;

public interface IBasicService {

	public List<BasicData> query(BasicData bd);
	
	public PageInfo<BasicData> queryPage(BasicDataDto dto);
	
	public void addBasicData(BasicData bd);
	
	public void deleteBasicData(int id);
	
	public void updateBasicData(BasicData bd);
	
	public void getUpdateInfo(Integer id, Model m);

}

