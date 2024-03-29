package com.example.end.service;

import com.example.end.domain.dto.Contact;
import com.example.end.domain.dto.CreateChatRequest;
import com.example.end.domain.dto.PersonalContact;
import com.example.end.domain.dto.UpdateChatRequest;
import com.example.end.domain.model.ChatMember;
import org.bson.types.ObjectId;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;

public interface ChatService {
    public PersonalContact createChat(CreateChatRequest request);
    public Set<ChatMember.Permission> getDefaultPermissions(ObjectId chatId);
    public Contact updateChatInfo(ObjectId chatId, UpdateChatRequest request);
    public String updateChatImage(ObjectId chatId, MultipartFile file);
    public boolean existsByIdentifier(String identifier);
    public void deleteChat(ObjectId chatId);
}
