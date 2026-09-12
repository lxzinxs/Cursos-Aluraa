package Exercicio_04;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("O valor de fahrenheit é: " + fahrenheit);
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("O valor de Celsius é: %.2f", celsius);
    }
}
