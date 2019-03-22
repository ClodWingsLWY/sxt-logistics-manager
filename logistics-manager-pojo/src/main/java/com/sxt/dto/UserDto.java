package com.sxt.dto;

import java.util.List;

import com.sxt.pojo.User;

/**
 * User传输对象
 * @author lwy
 */
public class UserDto extends BasePage{
	public User user;//用户信息
	public List<Integer> roles;//关联分配的角色信息
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Integer> getRoles() {
		return roles;
	}
	public void setRoles(List<Integer> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "UserDto [user=" + user + ", roles=" + roles + "]";
	}
}
