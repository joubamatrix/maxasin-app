package com.project.maxasin.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;
import com.project.maxasin.account.AccountService;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private AccountService accountService;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    com.project.maxasin.security.User appuser = accountService.getUserByUsername(username);
	    if(appuser == null ) throw new UsernameNotFoundException(username);
	    Collection<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
	    appuser.getRoles().forEach(r -> roles.add(new SimpleGrantedAuthority(r.getRoleName())));
		return new User (username, appuser.getPassword(), roles) ;
				
	}

}
