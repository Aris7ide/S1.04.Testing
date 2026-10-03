package N2.EX3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void shouldBeSameArray() {
        int[] array1 = new int[4];
        int[] array2 = new int[4];
        assertThat(array1).containsExactly(array2);
    }

}