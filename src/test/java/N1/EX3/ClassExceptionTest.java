package N1.EX3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassExceptionTest {

    ClassException classException = new ClassException();

    @Test
    void shouldLaunchException() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> classException.toException(4));
    }

}