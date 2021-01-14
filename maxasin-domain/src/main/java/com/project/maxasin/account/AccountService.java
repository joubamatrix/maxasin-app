package com.project.maxasin.account;

import com.project.maxasin.security.Role;
import com.project.maxasin.security.User;

public interface AccountService {

	public User saveUser(User user);
	public Role saveRole(Role role);
	public void addRoleToUser(String username , String RoleName);
	public User getUserByUsername(String username);
}
