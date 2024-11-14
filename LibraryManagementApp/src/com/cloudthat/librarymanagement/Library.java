package com.cloudthat.librarymanagement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {

    public static final long version = 1L;

    private Map<String, Book> books;
    private static Set<String> bookIsbns;

    public Library(){
        books = new HashMap<>();
        bookIsbns = new HashSet<>();
    }

    public void addBook(Book book){
        if(!bookIsbns.contains(book.getISBN())){
            books.put(book.getISBN(), book);
            bookIsbns.add(book.getISBN());
        }
    }

    public void removeBook(String isbn){
        if(books.containsKey(isbn)){
            Book removedBook = books.remove(isbn);
            System.out.println("Removed: "+ removedBook);
        }
    }

    public void  displayAllBooks(){
        if(books.isEmpty()){
            System.out.println("No books in library");
        }else {
            System.out.println("Books in library: ");
            for (Book b: books.values()){
                System.out.println(b);
            }
        }
    }

    public void lendBook(Borrowable book){
        book.borrow();
    }

    public void returnBook(Borrowable book){
        book.returnBook();
    }
}
