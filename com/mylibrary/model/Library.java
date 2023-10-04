package com.mylibrary.model;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> inventory;

    public void addBook(Book newBook, int booksAdded) {
        if (inventory.contains(newBook)) {
            int newBookIndex = inventory.indexOf(newBook);
            Book newBookStack = inventory.get(newBookIndex);
            newBookStack.setBooksOwned(newBookStack.getBooksOwned() + booksAdded);
            newBookStack.setBooksAtLibrary(newBookStack.getBooksAtLibrary() + booksAdded);

        }
        inventory.add(newBook);
    }
    public void addBook(Book newBook) {
        if (inventory.contains(newBook)) {
            int newBookIndex = inventory.indexOf(newBook);
            Book newBookStack = inventory.get(newBookIndex);
            newBookStack.setBooksOwned(newBookStack.getBooksOwned() + 1);
            newBookStack.setBooksAtLibrary(newBookStack.getBooksAtLibrary() + 1);

        }
        inventory.add(newBook);
    }

    public boolean borrowBook(Book bookToBorrow) {
        int bookToBorrowIndex = inventory.indexOf(bookToBorrow);
        if (bookToBorrowIndex < 0) return false;

        Book libraryBook = inventory.get(bookToBorrowIndex);
        int booksOwned = libraryBook.getBooksOwned();
        int booksAtLibrary = libraryBook.getBooksAtLibrary();
        if (booksOwned < 1 || booksAtLibrary < 1) return false;

        return true;
    }

}
