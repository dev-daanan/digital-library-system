package com.mylibrary;

import com.mylibrary.model.Book;
import com.mylibrary.model.Librarian;
import com.mylibrary.model.Library;
import com.mylibrary.model.User;

public class Main {
    public static void main(String[] args) {
//        Library library = new Library("Smooth Reading Library", new ArrayList<>());
//        Librarian librarian = new Librarian("Vivian", library);
//        User myself = new User("Daanan", "12345", new ArrayList<>(), new ArrayList<>());

        // Make dummy Book content
        Library myLibrary = new Library();
        Librarian librarian = new Librarian("Jane Doe", "E001", myLibrary);

        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "0987654321", "Fantasy", "Available");
        librarian.addBook(book2);

        // Verification of added book
        System.out.println(myLibrary.searchBookByKeyword("The Hobbit")); // Should find and display details of "The Hobbit".

        User user2 = new User("Alice", "U002");
        librarian.assistUser(user2, book2);

        // Verifying book status and borrowed books for user2
        System.out.println(book2.getStatus()); // Should print "Borrowed"
        // Add method to retrieve borrowedBooks from User class to display them and test.




    }
}
