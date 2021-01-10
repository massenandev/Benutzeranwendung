package com.supportportal.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class UserPrincipal implements UserDetails {
    //this userPrincipal, which is gonna be mapped by User, its the user spring security is gonna need to do all
    //the work it needs to do. And it needs to know all of this information below: the username, tha password...
    private User user;

    public UserPrincipal(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //we have to take all the user authorities inside an array;
        //map each one of them, as a simple granted authority, witch will create a new object of this class(SimpleGrantedAuthority)
        //collect all this collection and put it into a string
        return stream(this.user.getAuthorities()).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        //if we leave this as false, we always will fail when try to login
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        //the user has to verify the account before start to use it
        return this.user.isNotLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.user.isActive();
    }
}
