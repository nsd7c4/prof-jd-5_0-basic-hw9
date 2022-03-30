package com.RashidGafurov_INC_LOL;

import java.util.Objects;

//Assignment 2
public class Author {
    private String name;
    private String lastName;

    //Assignment 3
    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    //Assignment 4
    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    //    Assignment 1 Homework 10
    @Override
    public String toString() {
        return "\'" + name + " " + lastName + "\'";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
