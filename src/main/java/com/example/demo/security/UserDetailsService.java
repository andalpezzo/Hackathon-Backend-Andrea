package com.example.demo.security;


import static java.util.Collections.emptyList;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

import com.example.demo.user.UserRepository;

/**
 * @author Andrea Dal Pezzo
 */

@Service("userDetailsService")
public class UserDetailsService extends InMemoryUserDetailsManager {

    @Autowired
    private UserRepository userRepository;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	Optional<com.example.demo.user.User> user = userRepository.findByEmail(username);
		if (user == null) {
			throw new UsernameNotFoundException(username);
		}
		
		return new User(user.get().getUsername(),user.get().getPassword(), emptyList());
    }
}