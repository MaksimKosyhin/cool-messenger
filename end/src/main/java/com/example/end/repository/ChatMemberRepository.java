package com.example.end.repository;

import com.example.end.domain.model.ChatMember;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatMemberRepository extends MongoRepository<ChatMember, ObjectId> {

}