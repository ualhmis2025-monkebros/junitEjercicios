package ual.hmis.sesion05.ejercicio5;
import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio5 {

    private final List<String> palabras;

    public Ejercicio5(String contenido) {
        palabras = Arrays.stream(contenido.toLowerCase().split("\\s+"))
                         .collect(Collectors.toList());
    }

    public List<String> listarAlfabeticamente() {
        return palabras.stream()
                       .sorted()
                       .collect(Collectors.toList());
    }

    public List<String> listarPorFrecuencia() {
        Map<String, Long> frecuencia = palabras.stream()
                .collect(Collectors.groupingBy(p -> p, Collectors.counting()));

        return frecuencia.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}