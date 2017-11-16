package com.infotech.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.repository.MapId;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.infotech.entity.Book;
import com.infotech.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book save(Book book) {
		return bookRepository.saveBook(book);
	}

	@Override
	public Book findOne(int id) {
       return bookRepository.findOne(id, Book.class);
	}
    
	@Override
	public List<Book> findAll() {
       return (List<Book>) bookRepository.findAll(Book.class);
	}

}
