package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Library {
	@Id
	private int bookId;
	private int quantity;
	private String name;
	private String genre;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Library() {
		super();
	}
	public Library(int bookId, int quantity, String name, String genre) {
		super();
		this.bookId = bookId;
		this.quantity = quantity;
		this.name = name;
		this.genre = genre;
	}
	public Library(int quantity, String name, String genre) {
		super();
		this.quantity = quantity;
		this.name = name;
		this.genre = genre;
	}
	
	
}
