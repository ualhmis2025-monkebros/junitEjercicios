package ual.hmis.sesion05.ejercicio6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    @Test
    public void testCelsiusToFahrenheit() {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        double result = ejercicio6.convertTemperature(100, "Celsius", "Fahrenheit");
        assertEquals(212.0, result, 0.001);
    }

    @Test
    public void testCelsiusToKelvin() {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        double result = ejercicio6.convertTemperature(0, "Celsius", "Kelvin");
        assertEquals(273.15, result, 0.001);
    }

    @Test
    public void testFahrenheitToCelsius() {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        double result = ejercicio6.convertTemperature(32, "Fahrenheit", "Celsius");
        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testFahrenheitToKelvin() {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        double result = ejercicio6.convertTemperature(32, "Fahrenheit", "Kelvin");
        assertEquals(273.15, result, 0.001);
    }

    @Test
    public void testKelvinToCelsius() {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        double result = ejercicio6.convertTemperature(273.15, "Kelvin", "Celsius");
        assertEquals(0.0, result, 0.001);
    }

    @Test
    public void testKelvinToFahrenheit() {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        double result = ejercicio6.convertTemperature(273.15, "Kelvin", "Fahrenheit");
        assertEquals(32.0, result, 0.001);
    }

    @Test
    public void testInvalidUnits() {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        double result = ejercicio6.convertTemperature(100, "Invalid", "Celsius");
        assertTrue(Double.isNaN(result));
    }

    @Test
    public void testSameUnits() {
        Ejercicio6 ejercicio6 = new Ejercicio6();
        double result = ejercicio6.convertTemperature(100, "Celsius", "Celsius");
        assertTrue(Double.isNaN(result)); // Asumiendo que esto no está definido en el método
    }
}