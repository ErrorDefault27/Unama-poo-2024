public class Conversao{

    public static double celsiusParaFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double quilometrosParaMilhas(double km) {
        return km * 0.621371;
    }

    public static double milhasParaQuilometros(double milhas) {
        return milhas * 1.609344;
    }

    public static double metrosParaCentimetros(double metros) {
        return metros * 100;
    }

    public static double centimetrosParaMetros(double centimetros) {
        return centimetros / 100;
    }

    public static void main(String[] args) {
        System.out.println("Conversões de Temperatura:");
        System.out.println(" 30°C em Fahrenheit: " + celsiusParaFahrenheit(30));
        System.out.println(" 86°F em Celsius: " + fahrenheitParaCelsius(86));

        System.out.println("\nConversões de Distância:");
        System.out.println(" 15 km em milhas: " + quilometrosParaMilhas(15));
        System.out.println(" 10 milhas em km: " + milhasParaQuilometros(10));
        System.out.println(" 8 metros em centímetros: " + metrosParaCentimetros(8));
        System.out.println(" 500 centímetros em metros: " + centimetrosParaMetros(500));
    }
}