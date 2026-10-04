package N3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void shouldStartWithZero() {
        assertEquals(0, calculator.getResult());
    }

    @Test
    void shouldAddToResult() {
        calculator.add(10);
        assertEquals(10, calculator.getResult());
    }

    @Test
    void shouldRestToResult() {
        calculator.add(10);
        calculator.rest(5);
        assertEquals(5, calculator.getResult());
    }

    @Test
    void shouldMultiplyResult() {
        calculator.add(10);
        calculator.multiply(5);
        assertEquals(50, calculator.getResult());
    }

    @Test
    void shouldDivideResult() {
        calculator.add(10);
        calculator.divide(2);
        assertEquals(5, calculator.getResult());
    }

}