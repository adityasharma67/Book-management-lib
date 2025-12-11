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
        books.add("The Alchemist");
        books.add("Atomic Habits");
        books.add("The Hobbit");

        System.out.println("📚 Books in Library:");
        books.forEach(System.out::println);
    }
}
