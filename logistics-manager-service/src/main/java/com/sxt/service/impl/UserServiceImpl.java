package com.sxt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxt.dto.UserDto;
import com.sxt.mapper.RoleMapper;
import com.sxt.mapper.UserMapper;
import com.sxt.pojo.Role;
import com.sxt.pojo.RoleExample;
import com.sxt.pojo.User;
import com.sxt.pojo.UserExample;
import com.sxt.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userMapper;
	@Resource
	private RoleMapper roleMapper;
	@Override
	public List<User> query(User user) {
		UserExample example=new UserExample();
		return userMapper.selectByExample(example);
	}

	@Override
	public void addUser(User user) throws Exception {
		userMapper.insertSelective(user);
	}

	@Override
	public void updateUser(User user) throws Exception {
		userMapper.updateByPrimaryKey(user);
	}

	@Override
	public void deleteUser(int id) throws Exception {
		//删除关联表中的数据
		userMapper.deleteRoleIdByUserId(id);
		//删除用户表中的数据
		userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void getUpdateUserInfo(Integer id, Model model) {
		RoleExample roleExample=new RoleExample();
		List<Role> roles=roleMapper.selectByExample(roleExample);
		if(id!=null && id>0){
			//更新
			User user=userMapper.selectByPrimaryKey(id);
			List<Integer> roleIds=userMapper.selectRoleIdByUserId(id);
			model.addAttribute("user", user);
			model.addAttribute("roleIds",roleIds);
		}
		model.addAttribute("roles", roles);
	}

	@Override
	public void saveOrUpdate(UserDto userDto) throws Exception {
		// 获取User对象
		User user = userDto.getUser();
		// 获取关联的角色信息
		List<Integer> roles = userDto.getRoles();
		// 判断是添加还是修改数据
		if(user.getUserId()!=null && user.getUserId() > 0){
			// 表示userId存在，说明是更新
			//1.更新用户信息
			userMapper.updateByPrimaryKeySelective(user);
			//2.根据用户编号删除所有的角色关系
			userMapper.deleteRoleIdByUserId(user.getUserId());
			//3.添加角色和用户的关联关系
			if(roles!=null && roles.size() > 0){
				for (Integer roleId : roles) {
					userMapper.inserUserIdAndRoleId(user.getUserId(),roleId);
				}
			}
		}else{
			// 不存在id说明是添加数据
			// 先添加用户数据 获取生成的userId
			userMapper.insert(user);
			// 再保存用户和角色的对应关系，在一个事务中处理
			if(roles!=null && roles.size() > 0){
				for (Integer roleId : roles) {
					userMapper.inserUserIdAndRoleId(user.getUserId(),roleId);
				}
			}
		}
	}

	@Override
	public PageInfo<User> queryPage(UserDto dto) {
		PageHelper.startPage(dto.getPageNum(), dto.getPageSize());
		List<User> list = this.query(dto.getUser());
		PageInfo<User> pageInfo = new PageInfo<User>(list);
		return pageInfo;
	}

}
