package com.example.end.domain.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document(collection = "chats")
@Data
public class Chat {
    @Id
    private ObjectId id;

    private String displayName;

    private String identifier;

    private String info;

    private String imagePath;

    private ChatType type;

    private Set<ChatMember.Permission> defaultPermissions;

    public enum ChatType {
        GROUP, CHANNEL, DIALOGUE;
    }
}
