package N3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void shouldStartWithZero() {
        assertEquals(0, calculator.getResult());
    }

}