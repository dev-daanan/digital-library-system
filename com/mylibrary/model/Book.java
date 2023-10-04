package com.mylibrary.model;

public class Book {
    private String title;
    private String summary;
    private String[] authors;
    private int ISBN;
    private int booksOwned;
    private int booksAtLibrary;

    public Book(String title, String summary, String[] authors, int ISBN, int booksOwned, int booksAtLibrary) {
        this.title = title;
        this.summary = summary;
        this.authors = authors;
        this.ISBN = ISBN;
        this.booksOwned = booksOwned;
        this.booksAtLibrary = booksAtLibrary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getBooksOwned() {
        return booksOwned;
    }

    public void setBooksOwned(int booksOwned) {
        this.booksOwned = booksOwned;
    }

    public int getBooksAtLibrary() {
        return booksAtLibrary;
    }

    public void setBooksAtLibrary(int booksAtLibrary) {
        this.booksAtLibrary = booksAtLibrary;
    }
}
