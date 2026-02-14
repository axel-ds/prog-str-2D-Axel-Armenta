import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona[] personas = new Persona[20];
        int opc;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1) Alta\n2) Buscar\n3) Baja\n4) Listar\n5) Actualizar\n0) Salir");
            System.out.print("Opción: ");
            opc = sc.nextInt();

            if (opc == 1) { // ALTA
                System.out.print("ID: "); int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Nombre: "); String nom = sc.nextLine();

                if (id > 0 && !nom.isEmpty()) {
                    boolean repetido = false;
                    for (Persona p : personas) {
                        if (p != null && p.id == id) repetido = true;
                    }
                    if (!repetido) {
                        for (int i = 0; i < personas.length; i++) {
                            if (personas[i] == null) {
                                personas[i] = new Persona(id, nom);
                                System.out.println("¡Guardado!");
                                break;
                            }
                        }
                    } else System.out.println("ID repetido.");
                } else System.out.println("Datos inválidos.");

            } else if (opc == 2) { // BUSCAR
                System.out.print("ID a buscar: "); int idBus = sc.nextInt();
                boolean hallado = false;
                for (Persona p : personas) {
                    if (p != null && p.id == idBus && p.activa) {
                        System.out.println("Nombre: " + p.nombre);
                        hallado = true; break;
                    }
                }
                if (!hallado) System.out.println("No encontrado o inactivo.");

            } else if (opc == 3) { // BAJA
                System.out.print("ID para baja: "); int idBaja = sc.nextInt();
                for (Persona p : personas) {
                    if (p != null && p.id == idBaja) p.activa = false;
                }
                System.out.println("Proceso terminado.");

            } else if (opc == 4) { // LISTAR
                for (Persona p : personas) {
                    if (p != null && p.activa) System.out.println(p.id + " - " + p.nombre);
                }

            } else if (opc == 5) { // ACTUALIZAR
                System.out.print("ID: "); int idAct = sc.nextInt();
                sc.nextLine();
                for (Persona p : personas) {
                    if (p != null && p.id == idAct && p.activa) {
                        System.out.print("Nuevo nombre: ");
                        p.nombre = sc.nextLine();
                    }
                }
            } else if (opc != 0) {
                System.out.println("Opción inválida.");
            }

        } while (opc != 0);
        System.out.println("Fin del programa.");
    }
}