package com.example.end.repository;

import com.example.end.domain.model.Message;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRespository extends MongoRepository<Message, ObjectId> {
}
