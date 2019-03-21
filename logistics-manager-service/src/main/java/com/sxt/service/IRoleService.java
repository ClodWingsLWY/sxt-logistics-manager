package com.sxt.service;

import java.util.List;

import com.sxt.pojo.Role;

public interface IRoleService {
	/**
	 * 根据条件查询角色
	 * @param role
	 * @return
	 */
	public List<Role> query(Role role);
	/**
	 * 添加角色信息
	 * @param role
	 * @throws Exception
	 */
	public void addRole(Role role) throws Exception;
	/**
	 * 根据角色ID更新角色
	 * @param role
	 * @throws Exception
	 */
	public void updateRole(Role role) throws Exception;
	/**
	 * 根据ID删除角色信息
	 * @param id
	 * @throws Exception
	 */
	public void deleteRole(int id) throws Exception;
}
