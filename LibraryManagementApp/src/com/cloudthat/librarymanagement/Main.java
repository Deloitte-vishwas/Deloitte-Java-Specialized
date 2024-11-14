package com.cloudthat.librarymanagement;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Library Management");
        Library library = new Library();

        // Create Physical & ebook
        PhysicalBook physicalBook = new PhysicalBook("Introduction to Java", new Author(123456L, "Vishwas K Singh", "vishwas@cloudthat.com"), "1234567L", 345);
        library.addBook(physicalBook);

        library.displayAllBooks();

        // To find a book
        library.findByIsbn("1234567L");
        library.findByIsbn("123L");

    }
}