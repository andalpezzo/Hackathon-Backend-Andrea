package com.example.demo.security;

import org.springframework.security.core.GrantedAuthority;

import com.example.demo.user.User;

import java.util.Collection;
import java.util.List;

/**
 * @author Andrea Dal Pezzo
 */

public class UserDetails {

    private String userName;
    private String password;
    private List<GrantedAuthority> authorities;

    public UserDetails(User user) {
        userName = user.getEmail();
        password = user.getPassword();
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return userName;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }
}