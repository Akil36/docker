package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteRepository extends MongoRepository<Note, String> {
    // You can define custom queries here if needed
}
