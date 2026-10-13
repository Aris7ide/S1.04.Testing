package N1.EX1.service;

import N1.EX1.model.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookService {

    private List<Book> bookList;

    public BookService() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        for (Book b : bookList) {
            if (book.equals(b)){
                throw new RuntimeException("Book already exists");
            }
        }
        this.bookList.add(book);
    }

    public List<Book> getBookList() {
        return new ArrayList<>(this.bookList);
    }

    public String getBookName(int bookId) {
        if (bookId < 0 || bookId > bookList.size()) {
            throw new IndexOutOfBoundsException("Posiciòn invalida");
        }
        Book book = this.bookList.get(bookId);
        return book.getName();
    }

    public void addBookAtPosition (int bookId, Book book) {
        this.bookList.add(bookId, book);
    }

    public void removeBook(int bookId) {
        this.bookList.remove(bookId);
    }

    public List<Book> sortBookByName() {
        List<Book> copy = new ArrayList<>(this.bookList);

        copy.sort(Comparator.comparing(Book::getName, String.CASE_INSENSITIVE_ORDER));

        return copy;
    }




}
