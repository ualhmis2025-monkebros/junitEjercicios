package ual.hmis.sesion05.ejercicio4;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio4Test {

    @ParameterizedTest
    @CsvSource({
        "'', '', ''",                        // Ambas listas vacías
        "'', '1;2;3', '1;2;3'",              // Lista A vacía
        "'4;5;6', '', '4;5;6'",              // Lista B vacía
        "'1;3;5', '2;4;6', '1;2;3;4;5;6'",    // Listas sin duplicados
        "'1;2;3', '2;3;4', '1;2;2;3;3;4'"     // Listas con duplicados

    })
    void testMezclarListas(String listaA, String listaB, String esperado) {
        List<Integer> a = parseList(listaA);
        List<Integer> b = parseList(listaB);
        List<Integer> expected = parseList(esperado);

        List<Integer> resultado = Ejercicio4.mezclarListas(a, b);
        assertEquals(expected, resultado);
    }

    private List<Integer> parseList(String input) {
        if (input.trim().isEmpty()) return List.of();
        return Arrays.stream(input.split(";"))
                     .map(Integer::parseInt)
                     .toList();
    }
}