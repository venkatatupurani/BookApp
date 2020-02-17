package com.book.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.book.model.Book;


public interface BookRepository extends MongoRepository<Book, Integer>{

}
