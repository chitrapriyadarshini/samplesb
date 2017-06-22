package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="book")
public class Book {
	@Id
	@Column(name="isbn13")
 private int isbn13;
	@NotNull
	@Column(name="title")
 private String title;
	@Column(name="author")
 private String author;
 
 @NotNull
 @Column(name="content")
 private String content;
 @Column(name="price")
 private int price;
 @Column(name="status")
 private String status;
 
	public int getIsbn13() {
		return isbn13;
	}
	public void setIsbn13(int isbn13) {
		this.isbn13 = isbn13;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
