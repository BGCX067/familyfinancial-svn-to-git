package com.google.code.p.familyfinancial.action;

import com.google.code.p.familyfinancial.domain.Book;

public class BookAction extends ActionBase{
	
	private Book book;
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String list()
	{
		return SUCCESS;
	}
	
	public String store()
	{
		System.out.println(book);
		return SUCCESS;
	}
}
