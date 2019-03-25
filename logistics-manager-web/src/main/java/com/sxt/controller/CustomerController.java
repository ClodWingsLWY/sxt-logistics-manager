package com.sxt.controller;

import java.io.IOException;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.sxt.dto.CustomerDto;
import com.sxt.pojo.Customer;
import com.sxt.pojo.User;
import com.sxt.service.ICustomerService;
import com.sxt.utils.Constant;


@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Resource
	private ICustomerService customerService;
	
	@RequestMapping("/query")
	public String query(CustomerDto dto,Model model){
		// 获取登录用户信息
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		PageInfo<CustomerDto> list = customerService.queryPage(dto,user);
		model.addAttribute(Constant.PAGEHELP_MODEL, list);
		return "customer/customer";
	}
	@RequestMapping("/customerUpdate")
	public String customerUpdate(Integer id,Model model){
		customerService.getUpdateInfo(id, model);
		return "customer/customerUpdate";
	}
	@RequestMapping("/saveOrUpdate")
	public String saveOrUpdate(Customer customer) throws IOException{
		if(customer.getCustomerId()!=null && customer.getCustomerId()>0){
			// 更新
			customerService.updateCustomer(customer);
		}else{
			// 添加
			customerService.addCustomer(customer);
		}
		return "redirect:/customer/query";
	}
	@RequestMapping("/delete")
	public String delete(Integer id) throws IOException{
		customerService.deleteCustomer(id);
		return "redirect:/customer/query";
	}

}
