package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@Controller
@RequestMapping("book")
public class BookController {
@Autowired
private BookService bookservice;
@GetMapping
public String list(ModelMap modelMap)
{
	List<Book> books=bookservice.findAll();
	System.out.println(books);
	modelMap.addAttribute("BOOK_LIST",books);
	return "book/list";
}
}
