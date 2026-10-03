package N1.com.service;

import N1.com.model.Book;

import java.util.List;

public class BookService {

    List<Book> listBooks;

    public BookService(List<Book> listBooks) {
        this.listBooks = listBooks;
    }

    public void addBook() {
        String name = ConsoleReader.readString("Cual es el nombre del libro?");
        listBooks.add(new Book(name));
        System.out.println("El libro ha sido añadido");
    }

    public void showBooks() {
        if (!listBooks.isEmpty()) {
            for (Book b : listBooks) {
                System.out.println(b.getName() + "\n");
            }
        } else {
            System.err.println("La lista està vacía");
        }
    }

    public void showBookByPosition() {
        int position = ConsoleReader.readInt("Que posiciòn");
        System.out.println(listBooks.get(position));
    }

    public void addBookToPosition() {
        String name = ConsoleReader.readString("Como se llama el libro?");
        int position = ConsoleReader.readInt("En que posiciòn?");
        listBooks.add(position,new Book(name));
    }

    public void deleteBookByName() {
        if (!listBooks.isEmpty()) {
            String name = ConsoleReader.readString("Como se llama el libro?");
            for (Book b : listBooks) {
                if (b.getName().equalsIgnoreCase(name)) {
                    listBooks.remove(b);
                }
            }
        } else {
            System.err.println("La lista està vacía");
        }
    }
}
