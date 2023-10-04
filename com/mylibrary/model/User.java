package com.mylibrary.model;

import java.util.ArrayList;
import java.util.Objects;

public class User {
    private String userName;
    private String userID;
    private ArrayList<Book> checkedOutBooks;
    private ArrayList<String> subscriptions;

    public User(String userName, String userID, ArrayList<Book> checkedOutBooks, ArrayList<String> subscriptions) {
        this.userName = userName;
        this.userID = userID;
        this.checkedOutBooks = checkedOutBooks;
        this.subscriptions = subscriptions;
    }

    public boolean checkoutBook(Book book) { // Allows the user to check out a book.
        if (checkedOutBooks.contains(book) ||
                Objects.equals(book.getStatus(), "Checked out") ||
                Objects.equals(book.getStatus(), "Reserved")) {
            return false;
        }
        checkedOutBooks.add(book);
        book.checkoutBook();
        return true;
    }

    public Book returnBook(Book book) { // Allows the user to return a book.
        checkedOutBooks.remove(book);
        return book;

    }

    public void viewCheckedOutBooks() {
        System.out.println("Checked out books:");
        for (Book book : checkedOutBooks) {
            System.out.println(book);
        }
    }

}
