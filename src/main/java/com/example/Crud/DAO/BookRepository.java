package com.example.Crud.DAO;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Crud.entity.Book;

public interface BookRepository extends  MongoRepository<Book, Integer> {
	

}
