package com.mylibrary.model;

import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName, ArrayList<Book> inventory) {
        this.libraryName = libraryName;
        this.books = inventory;
    }

    public Library() {
        this("Library Name Not Provided", new ArrayList<>());
    }

    public Library(String libraryName) {
        this(libraryName, new ArrayList<>());
    }


    public void addBook(Book book) {
        books.add(book);
    }
    public Book removeBook(String ISBN) {
        int index = 0;
        for (Book book : this.books) {
            if (book.getISBN().equals(ISBN)) {
                book.setStatus("Removed");
                return books.remove(index);
            }
            index++;
        }
        return null;
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book searchBookByKeyword(String keyword) {
        int index;
        for(index = 0; index < books.size(); index++) {
            if (books.get(index).getTitle().toLowerCase().contains(keyword.toLowerCase()) || books.get(index).getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                books.get(index).displayInfo();
                return books.get(index);
            }
        }
        System.out.println("Book not found.");
        return null;
    }

    public void displayAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
