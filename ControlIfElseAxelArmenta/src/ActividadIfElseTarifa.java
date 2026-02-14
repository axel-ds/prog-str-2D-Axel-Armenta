import java.util.Scanner;

/**
 * Clase que gestiona el cálculo de tarifas basado en la edad y
 * la condición de estudiante del usuario.
 */
public class ActividadIfElseTarifa {

    /**
     * Punto de entrada principal del programa.
     * Solicita datos al usuario y aplica la logica de control if-else.
     * * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();

        System.out.print("¿Eres estudiante? (true/false): ");
        boolean esEstudiante = teclado.nextBoolean();

        int tarifa = 0;

        /**
         * Validacion de rango de edad.
         * Si la edad es menor a 0 o mayor a 120, se considera invalida.
         */
        if (edad < 0 || edad > 120) {
            System.out.println("Edad invalida");
            return;
        }

        // Lógica de cálculo de tarifa
        if (edad < 12) {
            tarifa = 50;
        } else if (edad >= 12 && edad <= 17) {
            if (esEstudiante) {
                tarifa = 60;
            } else {
                tarifa = 80;
            }
        } else {
            if (esEstudiante) {
                tarifa = 90;
            } else {
                tarifa = 120;
            }
        }

        System.out.println("Edad ingresada: " + edad);
        System.out.println("¿Es estudiante?: " + esEstudiante);
        System.out.println("Tarifa final: $" + tarifa);
    }
}