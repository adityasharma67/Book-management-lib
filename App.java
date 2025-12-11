package com.library;

import java.util.*;

public class App {
    static List<String> books = new ArrayList<>();

    public static void addBook(String name) {
        books.add(name);
    }

    public static boolean searchBook(String title) {
        return books.stream().anyMatch(b -> b.equalsIgnoreCase(title));
    }

    public static void main(String[] args) {
        addBook("The Alchemist");
        addBook("Atomic Habits");
        addBook("The Hobbit");

        System.out.println("📚 Books in Library:");
        books.forEach(System.out::println);
    }
}
