package com.project.maxasin.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.project.maxasin.repository.RoleRepository;
import com.project.maxasin.repository.UserRepository;
import com.project.maxasin.security.Role;
import com.project.maxasin.security.User;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	BCryptPasswordEncoder bcryptPasswordEncoder;
	
	@Override
	public User saveUser(User user) {
	   String pass = bcryptPasswordEncoder.encode(user.getPassword());
	   user.setPassword(pass);
		return userRepository.save(user);
	}

	@Override
	public Role saveRole(Role role) {

		return roleRepository.save(role);
	}

	@Override
	public void addRoleToUser(String username, String RoleName) {
		User user = userRepository.findUserByUsername(username);
		Role role = roleRepository.findRoleByRolename(RoleName);
		user.getRoles().add(role);
		
	}

	@Override
	public User getUserByUsername(String username) {
	
		return userRepository.findUserByUsername(username);
	}

	
}
