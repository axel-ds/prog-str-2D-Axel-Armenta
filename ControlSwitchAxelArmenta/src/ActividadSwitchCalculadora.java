import java.util.Scanner;

/**
 * Clase que simula una calculadora basica utilizando la estructura switch.
 * Permite realizar suma, resta, multiplicación y división.
 */
public class ActividadSwitchCalculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Mostrar menú
        System.out.println("Menu de calculadora");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");

        System.out.print("Elige una opción (1-4): ");
        int opcion = leer.nextInt();

        System.out.print("Ingresa el valor de a: ");
        double a = leer.nextDouble();
        System.out.print("Ingresa el valor de b: ");
        double b = leer.nextDouble();

        double resultado = 0;
        String operacionTexto = "";
        boolean mostrarResultado = true;

        switch (opcion) {
            case 1:
                operacionTexto = "Suma";
                resultado = a + b;
                break;
            case 2:
                operacionTexto = "Resta";
                resultado = a - b;
                break;
            case 3:
                operacionTexto = "Multiplicacion";
                resultado = a * b;
                break;
            case 4:
                operacionTexto = "Division";
                if (b == 0) {
                    System.out.println("No se puede dividir entre cero");
                    mostrarResultado = false;
                } else {
                    resultado = a / b;
                }
                break;
            default:
                System.out.println("Opción inválida");
                mostrarResultado = false;
                break;
        }

        if (mostrarResultado) {
            System.out.println("\n Resumen ");
            System.out.println("Operacion elegida: " + operacionTexto);
            System.out.println("Valores ingresados: a = " + a + ", b = " + b);
            System.out.println("Resultado:" + resultado);
        }

        leer.close();
    }
}
