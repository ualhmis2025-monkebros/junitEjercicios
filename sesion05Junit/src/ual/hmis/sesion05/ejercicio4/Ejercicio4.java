package ual.hmis.sesion05.ejercicio4;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    public static <T extends Comparable<T>> List<T> mezclarListas(List<T> listaA, List<T> listaB) {
        List<T> resultado = new ArrayList<>();
        int i = 0, j = 0;

        while (i < listaA.size() && j < listaB.size()) {
            T a = listaA.get(i);
            T b = listaB.get(j);
            if (a.compareTo(b) <= 0) {
                resultado.add(a);
                i++;
            } else {
                resultado.add(b);
                j++;
            }
        }

        while (i < listaA.size()) {
            resultado.add(listaA.get(i++));
        }

        while (j < listaB.size()) {
            resultado.add(listaB.get(j++));
        }

        return resultado;
    }
}