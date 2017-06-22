package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {
@Autowired
private BookRepository bookrepository;
public List<Book> findAll()
{
	return bookrepository.findAll();
}
}
