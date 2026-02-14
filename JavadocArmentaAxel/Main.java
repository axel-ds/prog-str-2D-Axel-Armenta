import java.util.Scanner;


public class Main {


    public static final double RANGO_BAJO = 18.5;
    public static final double RANGO_MEDIO = 25;
    public static final double RANGO_ALTO = 30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("  menú de opciones ");
            System.out.println("1. Calcular IMC con clasificacion");
            System.out.println("2. Calcular area de un rectangulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular área de un círculo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Usamos la accion obtenerDouble para capturar datos
                    double peso = obtenerDouble(scanner, "Ingresa el peso en kilogramos (ej: 80):");
                    double altura = obtenerDouble(scanner, "Ingresa la altura en Metros (ej: 1.80):");
                    double imc = calcularImc(peso, altura);

                    System.out.println("Tu IMC es de: " + imc);
                    System.out.println("Clasificación: " + obtenerClasificacion(imc));
                    break;
                case 2:
                    double base = obtenerDouble(scanner, "Ingrese la base:");
                    double h = obtenerDouble(scanner, "Ingrese la altura:");
                    System.out.println("El área del rectángulo es: " + calcularAreaRectangulo(base, h));
                    break;
                case 3:
                    double celsius = obtenerDouble(scanner, "Ingrese los grados Celsius:");
                    System.out.println("Grados Fahrenheit: " + convertirCelsiusAFahrenheit(celsius));
                    break;
                case 4:
                    double radio = obtenerDouble(scanner, "Ingrese el radio del circulo:");
                    System.out.println("El area del circulo es: " + calcularAreaCirculo(radio));
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("opcion no valida.");
            }
            System.out.println();

        } while (choice != 5);

        scanner.close();
    }


    public static double obtenerDouble(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextDouble();
    }

    // calcula el IMC usando la formula peso / altura al cuadrado.

    public static double calcularImc(double pesoKG, double alturaM){
        return pesoKG / (alturaM * alturaM);
    }

    // determina la clasificación de salud según el valor del IMC.

    public static String obtenerClasificacion(double imc){
        if(imc < RANGO_BAJO) return "Bajo peso";
        else if(imc < RANGO_MEDIO) return "Peso medio";
        else if(imc < RANGO_ALTO) return "Sobre peso";
        else return "Obesidad";
    }

    // Calcula el área de un rectángulo.
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // convierte celsius a fahrenheit.

    public static double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    // Calcula el área de un círculo

    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}