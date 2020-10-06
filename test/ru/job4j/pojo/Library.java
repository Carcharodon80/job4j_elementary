package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 800);
        Book fightClub = new Book("Fight club", 500);
        Book dune = new Book("Dune", 800);
        Book hobbit = new Book("Hobbit", 300);

        Book[] books = new Book[] {cleanCode, fightClub, dune, hobbit};

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        System.out.println();

        Book tempBook = books[0];
        books[0] = books[3];
        books[3] = tempBook;

        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();

        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book);
            }
        }
    }
}
