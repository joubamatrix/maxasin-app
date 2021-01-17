package com.project.maxasin.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.project.maxasin.security.Role;

public interface RoleRepository extends JpaRepository<Role, Long>  {

	public Role findRoleByRoleName(String rolename);
	
}
