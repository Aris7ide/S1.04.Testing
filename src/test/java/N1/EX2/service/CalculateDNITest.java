package N1.EX2.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculateDNITest {

    @ParameterizedTest
    @CsvSource ({"12345678, Z",
            "00000000, T",
            "87654321, X",
            "53821947, S",
            "34564523, P",
            "76543210, S",
            "01234567, L",
            "44444444, A",
            "11111111, H",
            "99999999, R"})
    void shouldValidateLogic(String number, char letra) {
        CalculateDNI calculateDNI = new CalculateDNI();
        assertEquals(letra, calculateDNI.calcularLetra(number));
    }

    @ParameterizedTest
    @CsvSource ({"asdh","23456","000000","-12368653"
    })
    void shouldNotValidate(String number) {
        CalculateDNI calculateDNI = new CalculateDNI();
        assertThrows(IllegalArgumentException.class,() -> calculateDNI.calcularLetra(number));
    }


}