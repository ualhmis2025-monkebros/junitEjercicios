package ual.hmis.sesion05.ejercicio3;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio3Test {

    @ParameterizedTest
    @CsvSource({
        "'abc', 'password demasiado corto'",      // < 5 caracteres
        "'abcde', '********'",                    // 5 caracteres
        "'abcdef', '********'",                   // 6 caracteres
        "'abcdefg', '********'",                  // 7 caracteres
        "'abcdefgh', '********'",                 // 8 caracteres
        "'abcdefghi', '*********'",               // 9 caracteres
        "'abcdefghij', '**********'",             // 10 caracteres
        "'abcdefghijk', '***********'",           // 11 caracteres
        "'abcdefghijkl', '************'",         // 12 caracteres
        "'abcdefghijabcdefghijabcdefghijabcdefghij', '************'", // 40 caracteres
        "'abcdefghijabcdefghijabcdefghijabcdefghijabcd', 'password demasiado largo'" // 41 caracteres
    })

    void testMaskPassword(String input, String expected) {
        Ejercicio3 ejercicio3 = new Ejercicio3();
        String result = ejercicio3.maskPassword(input);
        assertEquals(expected, result);
    }
}
