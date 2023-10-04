package com.mylibrary.model;

public class Librarian {
    private String name;
    private String employeeId;
    private Library managedLibrary;

    public Librarian(String name, String employeeId, Library managedLibrary) {
        this.name = name;
        this.employeeId = employeeId;
        this.managedLibrary = managedLibrary;
    }

    public void addBook(Book book) {
        managedLibrary.addBook(book);
    }

    public void removeBook(Book book) {
        managedLibrary.removeBook(book);
    }
    public void assistUser(User user, Book book) {
        user.borrowBook(book);
    }
}
