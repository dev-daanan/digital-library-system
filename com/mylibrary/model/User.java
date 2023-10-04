package com.mylibrary.model;

import java.util.ArrayList;

public class User {
    private String userName;
    private String userID;
    private ArrayList<Book> borrowedBooks;

    public User(String userName, String userID, ArrayList<Book> checkedOutBooks) {
        this.userName = userName;
        this.userID = userID;
        this.borrowedBooks = checkedOutBooks;
    }
    public User(String userName, String userID) {
        this(userName, userID, new ArrayList<>());
    }

    public void borrowBook(Book book) { // Allows the user to check out a book.
        if ("Available".equals(book.getStatus())) {
            borrowedBooks.add(book);
            book.checkoutBook();
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.returnBook();
    }

    public void viewCheckedOutBooks() {
        System.out.println("Checked out books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }


}
