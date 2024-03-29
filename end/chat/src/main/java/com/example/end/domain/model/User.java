package com.example.end.domain.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@Document(collection = "users")
@Data
public class User implements UserDetails {

    @Id
    private ObjectId id;

    private String displayName;
    @Indexed
    private String identifier;

    private String email;

    private boolean enabled;

    private String password;

    private String imagePath;

    private String info;

    private Set<Remainder> remainders;

    private Set<ObjectId> contacts;

    private Map<String, Set<ObjectId>> folders;

    @Override
    public String getUsername() {
        return identifier;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public String getIdentifier() {
        return identifier;
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

    public record Remainder(
            ObjectId id,
            LocalDateTime notifyAt,
            String message) {
    }
}
