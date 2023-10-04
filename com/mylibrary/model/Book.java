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
}
