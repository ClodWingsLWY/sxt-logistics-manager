package com.sxt.dto;

import com.sxt.pojo.Role;

public class RoleDto extends BasePage {
	private Role role;

	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "RoleDto [role=" + role + "]";
	}
}
