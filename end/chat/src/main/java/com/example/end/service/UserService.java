package com.example.end.service;

import com.example.end.domain.dto.*;
import org.bson.types.ObjectId;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;

public interface UserService {
    public AuthResponse login(AuthRequest request);
    public void register(CreateUserRequest request);
    public void confirmRegistration(String token);
    public String updateProfileImage(String userId, MultipartFile file);
    public LoggedInUser updateUserInfo(String userId, UpdateUserRequest request);
    public LoggedInUser addContacts(String userId, Set<ObjectId> add);
    public LoggedInUser removeContacts(String userId, Set<ObjectId> toRemove);
    public boolean existsByIdentifier(String identifier);
    public void changePassword(String userId, UpdatePasswordRequest request);
    public void confirmEmailChange(String token);
}
