package ual.hmis.sesion05.ejercicio5;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio5Test {

    @ParameterizedTest
    @CsvSource({
        "'hola mundo hola mundo prueba hola adiós', 'adiós;hola;hola;hola;mundo;mundo;prueba'"
    })
    void testListarAlfabeticamente(String texto, String esperadoStr) {
        Ejercicio5 ejercicio = new Ejercicio5(texto);
        List<String> esperado = parseList(esperadoStr);
        assertEquals(esperado, ejercicio.listarAlfabeticamente());
    }

    @ParameterizedTest
    @CsvSource({
        "'hola mundo hola mundo prueba hola adiós', 'hola;mundo;adiós;prueba'"
    })
    void testListarPorFrecuencia(String texto, String esperadoStr) {
        Ejercicio5 ejercicio = new Ejercicio5(texto);
        List<String> esperado = parseList(esperadoStr);
        assertEquals(esperado, ejercicio.listarPorFrecuencia());
    }

    private List<String> parseList(String input) {
        if (input.trim().isEmpty()) return List.of();
        return Arrays.asList(input.split(";"));
    }
}