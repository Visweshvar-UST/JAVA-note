package org.example.streams;

import java.util.ArrayList;
import java.util.List;

public class BaseStreams {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("time is everything",124));
        books.add(new Book("habits",90));
        books.add(new Book("taken",55));
        books.add(new Book("atomic",34));
        books.add(new Book("thackali",89));

        List<String> res = books.stream()
                .filter(obj -> obj.pages < 100)
                .map(obj -> obj.name)
                .distinct()
                .sorted()
                .toList();

        System.out.println();
    }

    static class Book{
        private String name;
        private int pages;

        public Book() {
        }

        public Book(String name, int pages) {
            this.name = name;
            this.pages = pages;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }
    }
}
