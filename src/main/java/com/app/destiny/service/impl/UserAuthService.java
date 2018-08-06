package com.app.destiny.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.app.destiny.dao.UserDetailsDao;

@Service
public class UserAuthService implements UserDetailsService {
	
	@Autowired
	UserDetailsDao userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		try {
        	if(userName == null ||  userName.isEmpty()){
        		throw new UsernameNotFoundException("User not found");
        	}
            /*UserDetail user = userRepository.findByUsername(username);
            if (user == null || user.getAuthentication() == null) {
            	throw new UsernameNotFoundException("User not found");
            }*/
            return new User("user1", "newuser"+userRepository.getTotalUser(), getRoleAuthorities());
        } catch (Exception e) {
            throw new UsernameNotFoundException("User not found");
        }
		
	}
	
	 private Set<GrantedAuthority> getRoleAuthorities() {
	        Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
	            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("Admin");
	        return authorities;
	    }

}
