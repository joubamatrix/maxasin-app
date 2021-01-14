package com.project.maxasin.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import com.project.maxasin.account.AccountService;

public class UserDetailServiceImpl implements UserDetailsService {

	private AccountService accountService;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    com.project.maxasin.security.User appuser = accountService.getUserByUsername(username);
	    if(appuser == null ) throw new UsernameNotFoundException(username);
	    Collection<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
	    appuser.getRoles().forEach(r -> roles.add(new SimpleGrantedAuthority(r.getRoleName())));
		return new User (username, appuser.getPassword(), roles) ;
				//User(username, user.getPassword(), roles);
	}

}
