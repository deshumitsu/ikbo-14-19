package ru.mirea;

public class Practic1_Book {
    public static class Book
    {
        private String name;
        private String author;
        private String genre;
        private int number_of_pages;
        Book(String name, String author, String genre, int number_of_pages)
        {
            this.name = name;
            this.author = author;
            this.genre = genre;
            this.number_of_pages = number_of_pages;
        }
        public void ToString()
        {
            System.out.println(name);
            System.out.println(author);
            System.out.println(genre);
            System.out.println(number_of_pages);
        }


    }
    public static void main(String[] args)
    {
        Book bk;
        bk = new Book("Fight Club", "Chuck Palahniuk", "romance", 256);
        bk.ToString();
    }
}