package com.cloudthat.librarymanagement;

public abstract class Book implements Borrowable {

    private long id;
    private Author author;
    private String genre;
    private String ISBN;

    public abstract void borrow();
    public abstract void returnBook();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Book(long id, Author author) {
        this.id = id;
        this.author = author;
    }
}
