import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secreto = random.nextInt(100) + 1; // Cambiado a 100 para cumplir la regla 1
        int intentos = 0;
        int limiteIntentos = 7;
        boolean gano = false;
        int fueraDeRango = 0;
        int entradasNoNumericas = 0;

        System.out.println("Adivina el número secreto (1-100)");

        while (intentos < limiteIntentos) {
            System.out.print("Intento " + (intentos + 1) + ": ");

            if (sc.hasNextInt()) {
                int numero = sc.nextInt();

                if (numero < 1 || numero > 100) {
                    System.out.println("El número debe estar entre 1 y 100.");
                    fueraDeRango++;
                } else {
                    intentos++; // Solo cuenta el intento si es un número válido
                    if (numero == secreto) {
                        System.out.println("¡Ganaste!");
                        gano = true;
                        break;
                    } else if (numero > secreto) {
                        System.out.println("El numero secreto es menor.");
                    } else {
                        System.out.println("El numero secreto es mayor.");
                    }
                }
            } else {
                System.out.println("El dato ingresado no es numérico.");
                entradasNoNumericas++; //contador
                sc.next();
            }
        }

        if (!gano) {
            System.out.println("Perdiste. El número secreto era: " + secreto);
        }


        System.out.println("Entradas fuera de rango: " + fueraDeRango);
        System.out.println("Entradas no numéricas: " + entradasNoNumericas);
    }
}
