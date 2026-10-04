package N2.EX7;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmptyObjectTest {

    EmptyObject emptyObject = null;

    @Test
    void shouldBeEmpty() {
        assertThat(emptyObject).isNull();
    }

}