package com.sxt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.sxt.dto.UserDto;
import com.sxt.pojo.User;
import com.sxt.service.IUserService;
import com.sxt.utils.Constant;

/**
 * 角色 控制层
 * @author lwy
 */
@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;

	@RequestMapping("/query")
	public String query(User user,Model model){
		List<User> list = userService.query(user);
		model.addAttribute("list", list);
		return "user/user";
	}
	// 当前登录用户需要"管理员角色才能访问"
	@RequiresRoles("管理员")
	@RequestMapping("/queryPage")
	public String queryPage(UserDto dto,Model model){
		PageInfo<User> pageModel = userService.queryPage(dto);
		model.addAttribute(Constant.PAGEHELP_MODEL, pageModel);
		return "user/user";
	}
	/**
	 * 进入添加或者修改页面
	 * @param id
	 * @return
	 */
	@RequestMapping("/userUpdate")
	public String userUpdatePage(Integer id,Model model){
		// 查询添加或者更新需要的数据
		userService.getUpdateUserInfo(id,model);
		return "user/userUpdate";
	}
	/**
	 * 进入添加或者修改页面
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/saveOrUpdate")
	public String saveOrUpdate(UserDto userDto) throws Exception{
		userService.saveOrUpdate(userDto);
		return "redirect:/user/query";
	}
	/**
	 * 删除用户数据
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delete")
	public String deleteUser(Integer id) throws Exception{
		userService.deleteUser(id);
		return "redirect:/user/query";
	}
}
