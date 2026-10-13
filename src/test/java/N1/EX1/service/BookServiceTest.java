package N1.EX1.service;

import N1.EX1.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    BookService bookService;

    @BeforeEach
    void setUp() {
        bookService = new BookService();
    }

    @Test
    void shouldCollectionNotBeEmpty() {
        assertThat(bookService).isNotNull();
    }

    @Test
    void shouldBeRightAmountOfBooks() {
        assertThat(bookService.getBookList().size()).isEqualTo(0);

        bookService.addBook(new Book("Tarzan","Author"));
        bookService.addBook(new Book("Disney","Pixar"));

        assertThat(bookService.getBookList().size()).isEqualTo(2);
    }

    @Test
    void shouldBeInTheRightPosition() {
        bookService.addBook(new Book("Tarzan","Author"));
        bookService.addBook(new Book("Disney","Pixar"));

        assertThat(bookService.getBookList().get(0).getName()).isEqualTo("Tarzan");
        assertThat(bookService.getBookList().get(1).getName()).isEqualTo("Disney");
    }

    @Test
    void shouldGiveRightBook () {
        bookService.addBook(new Book("Tarzan","Author"));

        assertThat(bookService.getBookName(0)).isEqualTo("Tarzan");
    }

    @Test
    void shouldAddBookInTheRightPosition() {
        bookService.addBook(new Book("Tarzan","Author"));
        bookService.addBook(new Book("Disney","Pixar"));

        bookService.addBookAtPosition(1, new Book("Sandokan","Fabio"));

        assertThat(bookService.getBookList().size()).isEqualTo(3);
        assertThat(bookService.getBookList().get(1).getName()).isEqualTo("Sandokan");
        assertThat(bookService.getBookList().get(2).getName()).isEqualTo("Disney");
    }

    @Test
    void shouldReduceListSize() {
        bookService.addBook(new Book("Tarzan","Author"));
        bookService.addBook(new Book("Disney","Pixar"));

        assertThat(bookService.getBookList().size()).isEqualTo(2);

        bookService.removeBook(1);

        assertThat(bookService.getBookList().size()).isEqualTo(1);
    }

    @Test
    void shouldBeSortedAZ() {
        bookService.addBook(new Book("Tarzan","Author"));
        bookService.addBook(new Book("Disney","Pixar"));
        bookService.addBook(new Book("Sandokan","Fabio"));

        List<Book> copy = bookService.sortBookByName();

        assertThat(copy.getFirst().getName().equals("Disney"));
        assertThat(copy.getLast().getName().equals("Tarzan"));
    }

    @Test
    void shouldNotAllowDuplicate() {
        bookService.addBook(new Book("Tarzan","Author"));

        assertThatThrownBy(() -> bookService.addBook(new Book("Tarzan","Author"))).isInstanceOf(RuntimeException.class);
        assertThat(bookService.getBookList().size()).isEqualTo(1);

    }



}