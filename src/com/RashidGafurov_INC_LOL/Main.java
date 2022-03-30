package com.RashidGafurov_INC_LOL;

public class Main {

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
    }
}
