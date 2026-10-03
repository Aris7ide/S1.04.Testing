package N1.com.service;

import N1.com.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    List<Book> bookList = new ArrayList<>();

    @Test
    void shouldStartNull() {
        assertNotNull(bookList);
    }

}