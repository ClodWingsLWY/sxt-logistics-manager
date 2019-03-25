package com.sxt.service;

import org.springframework.ui.Model;

import com.github.pagehelper.PageInfo;
import com.sxt.dto.CustomerDto;
import com.sxt.pojo.Customer;
import com.sxt.pojo.User;

public interface ICustomerService {
	/**
	 * 查询更新或添加需要的信息
	 * @param id
	 * @param m
	 */
	public void getUpdateInfo(Integer id,Model m);
	/**
	 * 添加或修改
	 * @param customer
	 */
	public void addCustomer(Customer customer);
	/**
	* 分页查询
	 * @param dto
	 * @return
	 */
	public PageInfo<CustomerDto> queryPage(CustomerDto dto,User user);
	
	public void updateCustomer(Customer customer);
	
	public void deleteCustomer(Integer id);

}
