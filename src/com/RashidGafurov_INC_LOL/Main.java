package com.RashidGafurov_INC_LOL;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    //Homework 9 medium 2.a
    public static void addBook(Book[] books, Book bookToAdd) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = bookToAdd;
                break;
            }
        }
    }

    //Homework 9 medium 2.b
    public static void printAllBooks(Book[] books) {
        for (Book b :
                books) {
            if (b != null) {
                System.out.println(b.toString(true));
            }
        }
    }

    public static void main(String[] args) {
        //Assignment 6
        Author pushkinAS = new Author("Alexander", "Pushkin");
        Author gogolNV = new Author("Nikolai", "Gogol");

        Book mertvyeDushi = new Book("Mertvye Dushi", gogolNV, 1842);
        Book ruslanILudmila = new Book("Ruslan i Ludmila", pushkinAS, 1820);

        //Assignment 7
        mertvyeDushi.setYear(2022);
        System.out.println("mertvyeDushi.getYear() = " + mertvyeDushi.getYear());
        ruslanILudmila.setYear(1988);
        System.out.println("ruslanILudmila.getYear() = " + ruslanILudmila.getYear());

        //Assignment 1 HW 10

        Author gogolNV2 = new Author("Nikolai", "Gogol");
        System.out.println("gogolNV2.equals(gogolNV) = " + gogolNV2.equals(gogolNV));
        System.out.println("pushkinAS.toString() = " + pushkinAS.toString());
        System.out.println("pushkinAS.hashCode() = " + pushkinAS.hashCode());
        System.out.println("gogolNV.hashCode() = " + gogolNV.hashCode());
        System.out.println("gogolNV2.hashCode() = " + gogolNV2.hashCode());
        System.out.println("mertvyeDushi.equals(ruslanILudmila) = " + mertvyeDushi.equals(ruslanILudmila));
        System.out.println("ruslanILudmila.toString() = " + ruslanILudmila.toString());

        //Homework 9 medium 1
        Book[] books = new Book[3];
        books[0] = mertvyeDushi;
        books[1] = ruslanILudmila;

        //Homework 9 medium 2.a
        Author georgeOrwell = new Author("George", "Orwell");
        Book book1984 = new Book("1984", georgeOrwell, 1949);
        addBook(books, book1984);

        //Homework 9 medium 2.b
        printAllBooks(books);

        //Homework 9 hard 3
        Library books2 = new Library(10);
        books2.addBook(new Book("1", georgeOrwell, 1901));
        books2.addBook(new Book("2", gogolNV, 1902));
        books2.addBook(new Book("3", pushkinAS, 1903));
        books2.printAllBooks();

        //Homework 9 hard 4.1
        System.out.println(books2.bookByName("1"));

        //Homework 9 hard 4.2
        books2.setDate("2", 1988);
        books2.printAllBooks();

        //Homework 10 hard
        System.out.println(books2);

    }
}
