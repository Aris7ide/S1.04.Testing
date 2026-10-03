package N1.EX1.service;

import N1.EX1.model.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookService {

    List<Book> listBooks;

    public BookService(List<Book> listBooks) {
        this.listBooks = listBooks;
    }

    public void addBook(String name) {
        boolean result = false;
        for (Book b : listBooks) {
            if (b.getName().equalsIgnoreCase(name)) {
                result = true;
                break;
            }
        }
        if (!result) {
            listBooks.add(new Book(name));
        }
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

    public String showBookByPosition(int position) {
        return listBooks.get(position).getName();
    }

    public void addBookToPosition(String name, int position) {
        listBooks.add(position,new Book(name));
    }

    public void deleteBookByName(String name) {
        if (!listBooks.isEmpty()) {
            listBooks.removeIf(b -> b.getName().equalsIgnoreCase(name));
        } else {
            System.err.println("La lista està vacía");
        }
    }

    public List<Book> showBookAZ() {
        if (!listBooks.isEmpty()) {
            List<Book> listBookAZ = new ArrayList<>(listBooks);
            listBookAZ.sort(Comparator.comparing(Book::getName));
            return listBookAZ;
        } else {
            System.err.println("La lista està vacía");
            return null;
        }
    }
}
