package com.RashidGafurov_INC_LOL;

//Assignment 1
public class Book {
    String name;
    Author author;
    int year;

    //Assignment 3
    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    //Assignment 4
    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    //Assignment 5

    public void setYear(int year) {
        this.year = year;
    }
}
