/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3g.r;
import java.util.Scanner;
/**
 *
 * @author Mayelo
 */
public class EJERCICIO3GR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op;
        ReservaHotel reservas[] = null;
        int n = 0;

        do {
            System.out.println("\n--- SISTEMA DE RESERVAS DE HOTEL ---");
            System.out.println("1. Registrar reservas");
            System.out.println("2. Confirmar reserva (Ocupar)");
            System.out.println("3. Finalizar reserva");
            System.out.println("4. Mostrar informacion y total a pagar");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Cuantas reservas desea registrar?: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    reservas = new ReservaHotel[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nDatos de la reserva N°" + (i + 1));
                        System.out.print("Nombre del cliente: ");
                        String nombre = sc.nextLine();
                        System.out.print("Tipo de habitacion (simple, doble, suite): ");
                        String tipo = sc.nextLine();
                        System.out.print("Estado (reservado / ocupado / finalizado): ");
                        String estado = sc.nextLine();
                        System.out.print("Numero de noches: ");
                        int noches = sc.nextInt();
                        System.out.print("Precio por noche: ");
                        double precio = sc.nextDouble();
                        sc.nextLine();

                        reservas[i] = new ReservaHotel(nombre, tipo, estado, noches, precio);
                    }
                    break;
                case 2:
                    if (reservas != null) {
                        for (int i = 0; i < n; i++) {
                            System.out.println("\nProcesando reserva de: " + reservas[i].nombreCliente);
                            reservas[i].confirmarReserva();
                        }
                    } else {
                        System.out.println("Primero debe registrar las reservas.");
                    }
                    break;
                case 3:
                    if (reservas != null) {
                        for (int i = 0; i < n; i++) {
                            System.out.println("\nFinalizando reserva de: " + reservas[i].nombreCliente);
                            reservas[i].finalizarReserva();
                        }
                    } else {
                        System.out.println("Primero debe registrar las reservas.");
                    }
                    break;
                case 4:
                    if (reservas != null) {
                        for (int i = 0; i < n; i++) {
                            System.out.println();
                            reservas[i].mostrarReserva();
                        }
                    } else {
                        System.out.println("Primero debe registrar las reservas.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (op != 5);
        sc.close();
    }
    
}
