package com.example.end.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

@Document(collection = "users")
@Data
public class User implements UserDetails {

    @Id
    private String id;

    private String username;

    private String email;

    private boolean enabled;

    private String identifier;

    private String password;

    private String imageUrl;

    private String info;

    private Set<Remainder> remainders;

    private Map<String, List<String>> folders;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Data
    public static class Remainder {
        private String id;
        private Date notifyAt;
        private String message;
    }
}
