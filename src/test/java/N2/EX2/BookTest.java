package N2.EX2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void shouldBeSameRam() {
        Book book1 = new Book("BOOK");
        Book book2 = book1;

        assertThat(book1).isSameAs(book2);
    }

}