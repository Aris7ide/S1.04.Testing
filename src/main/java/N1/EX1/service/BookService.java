package N1.EX1.service;

import N1.EX1.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    private List<Book> bookList;

    public BookService() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
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




}
