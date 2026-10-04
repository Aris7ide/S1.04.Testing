package N2.EX6;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class ArrayClassTest {

    ArrayClass arrayClass = new ArrayClass();

    @Test
    void shouldLaunchException() {
        assertThatThrownBy(()->arrayClass.launchException()).isInstanceOf(ArrayIndexOutOfBoundsException.class);
    }

}