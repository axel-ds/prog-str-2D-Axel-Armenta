import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numeroLimite = pedirEntero();
        int sumaTotal = calcularSumaHastaN(numeroLimite);
        mostrarResultado(numeroLimite, sumaTotal);
    }


     // accion para pedir un número entero al usuario.

    public static int pedirEntero() {
        Scanner lector = new Scanner(System.in);
        System.out.print("introduce un numero entero para sumar: ");
        return lector.nextInt();
    }


     // accion que realiza el cálculo de la suma acumulada.

    public static int calcularSumaHastaN(int n) {
        int acumuladorSuma = 0;
        for (int i = 1; i <= n; i++) {
            acumuladorSuma += i;
        }
        return acumuladorSuma;
    }


     // accion para imprimir el resultado final.

    public static void mostrarResultado(int limite, int resultado) {
        System.out.println("el resultado de la suma de 1 hasta " + limite + " es de : " + resultado);
    }
}