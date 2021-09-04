package com.crud.mongoDb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.mongoDb.model.Book;
import com.crud.mongoDb.repository.repositoryBook;



@RestController
public class controllerBook {
	
	@Autowired
	private repositoryBook repository;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		repository.save(book);
		return "Added Book By Id:"+ book.getId();
	}
	
	@GetMapping("/findAllBook")
	public List<Book> getBook(){
		return repository.findAll();
	}
	
	@GetMapping("/findBook/{id}")
	public Optional<Book> getBookById(@PathVariable int id){
		return repository.findById(id);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "Book Deleted By Id:"+ id;
	}
	
	
	
	
	

}
