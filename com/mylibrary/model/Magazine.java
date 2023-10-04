package com.mylibrary.model;

public class Magazine extends Book {

    private String magazineName;
    private String issueMonth;

    public Magazine(String title, String author, String ISBN, String genre, String status, String magazineName, String issueMonth) {
        super(title, author, ISBN, genre, status);
        this.magazineName = magazineName;
        this.issueMonth = issueMonth;
    }
}
