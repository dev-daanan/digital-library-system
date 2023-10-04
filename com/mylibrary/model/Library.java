package com.mylibrary.model;

import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName, ArrayList<Book> inventory) {
        this.libraryName = libraryName;
        this.books = inventory;
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public Book removeBook(String ISBN) {
        int index = 0;
        for (Book book : this.books) {
            if (book.getISBN().equals(ISBN)) {
                break;
            }
            index++;
        }
        return books.remove(index);
    }

    public Book searchBook(String keyword) {
        int index = 0;
        for (Book book : this.books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
                break;
            }
            index++;
        }
        return books.get(index);
    }

    public void displayALlBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
