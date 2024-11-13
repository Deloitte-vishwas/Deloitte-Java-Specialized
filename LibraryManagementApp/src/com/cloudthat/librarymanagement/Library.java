package com.cloudthat.librarymanagement;

public class Library {

    public void lendBook(Borrowable book){
        book.borrow();
    }

    public void returnBook(Borrowable book){
        book.returnBook();
    }
}
