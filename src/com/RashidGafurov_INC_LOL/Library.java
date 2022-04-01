package com.RashidGafurov_INC_LOL;

import java.util.Arrays;

public class Library {
    //Hard 1
    private Book[] booksList;

    //Hard 2
    public Library(int size) {
        this.booksList = new Book[size];
    }


    //Hard 3
    public void addBook(Book bookToAdd) {
        for (int i = 0; i < booksList.length; i++) {
            if (booksList[i] == null) {
                booksList[i] = bookToAdd;
                break;
            }
        }
    }

    public void printAllBooks() {
        for (int i = 0; i < booksList.length; i++) {
            if (booksList[i] != null) {
                System.out.println(booksList[i].toString(true));
            }
        }
    }

    //Homework 9 hard 4.1
    public int getBookIndex(String name) {
        int index = -1;
        for (int i = 0; i < booksList.length; i++) {
            if (booksList[i].getName().equals(name)) {
                index = i;
                break;
            }
        }
        return index;
    }

    //Homework 9 hard 4.1
    public String bookByName(String name) {
        return booksList[getBookIndex(name)].toString(1);
    }


    //Homework 9 hard 4.2
    public void setDate(String name, int year) {
        booksList[getBookIndex(name)].setYear(year);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Library:");
        sb.append("\n");
        for (int i = 0; i < booksList.length; i++) {
            if (booksList[i] != null) {
                sb.append("Book: ");
                sb.append(booksList[i].toString(1f));
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
