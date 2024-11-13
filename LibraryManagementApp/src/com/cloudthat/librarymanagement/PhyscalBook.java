package com.cloudthat.librarymanagement;

public class PhyscalBook extends Book{
    private int numberOfPages;

    public PhyscalBook(long id, Author author) {
        super(id, author);
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void borrow() {
        System.out.println("Physical book borrowed");
    }

    @Override
    public void returnBook() {
        System.out.println("Physical book returned");
    }
}
