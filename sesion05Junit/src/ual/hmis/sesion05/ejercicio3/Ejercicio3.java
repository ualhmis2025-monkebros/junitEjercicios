package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {
    public String maskPassword(String password) {
        int length = password.length();

        if (length < 5) {
            return "password demasiado corto";
        } else if (length >= 5 && length <= 8) {
            return "*".repeat(8);
        } else if (length >= 12 && length <= 40) {
            return "*".repeat(12);
        } else if (length > 40) {
            return "password demasiado largo";
        } else {
            // Para casos no contemplados explícitamente (9 a 11 caracteres)
            return "*".repeat(length); // o puedes lanzar una excepción si se considera error
        }
    }
}
