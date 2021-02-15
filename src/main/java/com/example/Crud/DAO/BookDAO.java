package com.example.Crud.DAO;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Crud.entity.Book;


@Component
public class BookDAO {

@Autowired
private BookRepository repository;

public Collection<Book>getBooks(){
	return repository.findAll();
	
}

public Book createBook(Book book) {
	return repository.insert(book);
}
}
