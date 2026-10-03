package N1.EX1.service;

import N1.EX1.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    List<Book> bookList = new ArrayList<>();
    BookService bookService = new BookService(bookList);

     @BeforeEach
     void toTest() {
         bookList.add(new Book("Tarzan"));
         bookList.add(new Book("Hercules"));
         bookList.add(new Book("Aristóteles"));
     }

    @Test
    void shouldStartNull() {
        assertNotNull(bookList);
    }

    @Test
    void shouldLengthBeRight() {
        assertEquals(3,bookList.size());
    }

    @Test
    void shouldBeInRightPosition() {
         bookService.addBook("Disney");
         bookService.addBook("Pixar");
         assertEquals("Disney", bookList.get(3).getName());
         assertEquals("Pixar", bookList.get(4).getName());
    }

    @Test
    void shouldGetRightBook() {
         assertEquals("Aristóteles", bookService.showBookByPosition(2));
    }

    @Test
    void shouldModifyCollection() {
         bookList.add(1,new Book("Disney"));
         assertEquals("Disney", bookList.get(1).getName());
         assertEquals("Hercules", bookList.get(2).getName());
         assertEquals(4, bookList.size());
    }

    @Test
    void shouldReduceSizeWhenDeleted() {
         assertEquals(3, bookList.size());

         bookService.deleteBookByName("Hercules");

         assertEquals(2, bookList.size());
    }

    @Test
    void shouldGiveListAZ() {
         List<Book> listBookAZ = bookService.showBookAZ();

         assertEquals("Aristóteles", listBookAZ.getFirst().getName());
         assertEquals("Tarzan", listBookAZ.getLast().getName());
    }

    @Test
    void shouldNotAllowDuplicate() {
         assertEquals(3, bookList.size());

         bookService.addBook("Tarzan");

         assertEquals(3, bookList.size());
    }

}