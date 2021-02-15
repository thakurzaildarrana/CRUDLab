package com.example.Crud.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Crud.DAO.BookRepository;
import com.example.Crud.entity.Book;
import com.example.Crud.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
@Autowired
private BookService bookService;

@GetMapping
public Collection<Book>getBooks(){
	return bookService.getBooks();
}

@PostMapping
public Book postBook(@RequestBody Book book) {
	return bookService.createBook(book);
	
}
	
	
}
