package N2.EX1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AssertJTest {

    @Test
    void shouldMatch() {
        int value1 = 2;
        int value2 = 2;

        assertThat(value1).isEqualTo(value2);
    }

    @Test
    void shouldNotMatch() {
        int value1 = 2;
        int value2 = 3;

        assertThat(value1).isNotEqualTo(value2);
    }

}