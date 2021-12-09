package com.mycompany.hw5;

/**
 *
 * @author Luis Reynoso
 */

public class Book {
    private String title;
    private String author;
    private int price;
    private int numPages;
	
    public Book(String title, String author, int price, int numPages) {
	this.title = title;
	this.author = author;
	this.price = price;
	this.numPages = numPages;
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

    public int getPrice() {
	return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumPages() {
	return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
	return String.format("(%s, %s, %1.2f, %d )",title, author, (double)price, numPages);
    }
}
