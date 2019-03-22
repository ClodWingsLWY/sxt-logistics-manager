package com.sxt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sxt.pojo.Role;
import com.sxt.service.IRoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Resource
	private IRoleService service;
	@RequestMapping("/query")
	public String query(Role role,Model model){
		List<Role> list=service.query(role);
		model.addAttribute("list", list);
		return "role/role";
	}
}
