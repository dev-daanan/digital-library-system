package com.mylibrary.model;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private String genre;
    private String status;

    public Book(String title, String author, String ISBN, String genre, String status) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
        this.status = status;
    }

    public void displayInfo() {
        System.out.println(this);
    }
    public void checkoutBook() {
        this.status = "Checked Out";
    }

    public void returnBook() {
        this.status = "Available";
    }

    public void reserved() {
        this.status = "Reserved";
    }

    public void unReserve() {
        this.status = "Available";
    }

    @Override
    public String toString() {
        return  "title: '" + title + '\'' +
                ", author: '" + author + '\'' +
                ", ISBN: '" + ISBN + '\'' +
                ", genre: '" + genre + '\'' +
                ", status: '" + status + '\'';
    }

    public String getStatus() {
        return status;
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
