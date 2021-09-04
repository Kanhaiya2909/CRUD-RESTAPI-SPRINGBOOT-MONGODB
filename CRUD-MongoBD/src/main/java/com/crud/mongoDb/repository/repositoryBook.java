package com.crud.mongoDb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.crud.mongoDb.model.Book;

public interface repositoryBook extends MongoRepository<Book, Integer>{

}
