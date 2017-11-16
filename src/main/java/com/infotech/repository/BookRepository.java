package com.infotech.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Repository;

import com.infotech.entity.Book;

@Repository
public class BookRepository {
   
	@Autowired
	private CassandraOperations cassandraOperation;
	
	public Book saveBook(Book book) {
		return cassandraOperation.insert(book);
	}
	
	public Book findOne(int id, Class<Book> book) {
		return cassandraOperation.selectOneById(book,id);
	}
	
	public List<Book> findAll(Class<Book> book){
		return cassandraOperation.selectAll(book);
	}
}
