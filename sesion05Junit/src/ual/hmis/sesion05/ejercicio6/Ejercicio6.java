package ual.hmis.sesion05.ejercicio6;

public class Ejercicio6 {
    public double convertTemperature(double temperature, String fromUnit, String toUnit) {
        if (fromUnit.equalsIgnoreCase("Celsius") && toUnit.equalsIgnoreCase("Fahrenheit")) {
            return (temperature * 9 / 5) + 32;
        } else if (fromUnit.equalsIgnoreCase("Celsius") && toUnit.equalsIgnoreCase("Kelvin")) {
            return temperature + 273.15;
        } else if (fromUnit.equalsIgnoreCase("Fahrenheit") && toUnit.equalsIgnoreCase("Celsius")) {
            return (temperature - 32) * 5 / 9;
        } else if (fromUnit.equalsIgnoreCase("Fahrenheit") && toUnit.equalsIgnoreCase("Kelvin")) {
            return ((temperature - 32) * 5 / 9) + 273.15;
        } else if (fromUnit.equalsIgnoreCase("Kelvin") && toUnit.equalsIgnoreCase("Celsius")) {
            return temperature - 273.15;
        } else if (fromUnit.equalsIgnoreCase("Kelvin") && toUnit.equalsIgnoreCase("Fahrenheit")) {
            return ((temperature - 273.15) * 9 / 5) + 32;
        } else {
            // Devuelve Double.NaN si las unidades no son válidas
            return Double.NaN;
        }
    }
}
