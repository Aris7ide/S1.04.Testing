package N2.EX4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookTest {

    List<Object> mixedList;

    Book book;
    int number;
    String string;
    String unUsedString;

    @BeforeEach
    void toStart() {
    book = new Book("Tarzan");
    number = 67;
    string = "Just a string";
    unUsedString = "Not added String";

    mixedList = new ArrayList<>();
    mixedList.add(book);
    mixedList.add(number);
    mixedList.add(string);
    }

    @Test
    void shouldBeOrderOfInstance() {
        assertThat(mixedList).containsExactly(book,number,string);
    }

    @Test
    void shouldBeAddedOnlyOnce() {
        assertThat(mixedList).containsOnlyOnce(book);
    }

    @Test
    void shouldNotBeAdded() {
        assertThat(mixedList).doesNotContain(unUsedString);
    }

}