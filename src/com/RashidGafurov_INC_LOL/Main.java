package com.RashidGafurov_INC_LOL;

public class Main {

    public static void main(String[] args) {
        //Assignment 6
        Author pushkinAS = new Author("Alexander", "Pushkin");
        Author gogolNV = new Author("Nikolai", "Gogol");

        Book mertvyeDushi = new Book("Mertvye Dushi", gogolNV, 1842);
        Book ruslanILudmila = new Book("Ruslan i Ludmila", pushkinAS, 1820);
    }
}
