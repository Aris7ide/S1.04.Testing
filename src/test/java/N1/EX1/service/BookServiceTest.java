package N1.EX1.service;

import N1.EX1.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
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

}