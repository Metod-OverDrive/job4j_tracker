package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Алфавит", 33);
        Book book2 = new Book("Сборник Java", 500);
        Book book3 = new Book("Книга X", 0);
        Book book4 = new Book("Clean code", 400);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book temp = books[i];
            System.out.println(temp.getName() + " : " + temp.getPages());
        }
        System.out.println();

        books[0] = book4;
        books[3] = book1;
        for (int i = 0; i < books.length; i++) {
            Book temp = books[i];
            System.out.println(temp.getName() + " : " + temp.getPages());
        }
        System.out.println();

        for (int i = 0; i < books.length; i++) {
            Book temp = books[i];
            if ("Clean code".equals(temp.getName())) {
                System.out.println(temp.getName() + " : " + temp.getPages());

            }
        }
    }
}
