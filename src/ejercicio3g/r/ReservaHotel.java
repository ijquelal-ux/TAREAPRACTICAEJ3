/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3g.r;

/**
 *
 * @author Mayelo
 */
public class ReservaHotel {
    String nombreCliente, tipoHabitacion, estado;
    int numeroNoches;
    double precioPorNoche;

    public ReservaHotel() {
    }

    public ReservaHotel(String nombreCliente, String tipoHabitacion, String estado, int numeroNoches, double precioPorNoche) {
        this.nombreCliente = nombreCliente;
        this.tipoHabitacion = tipoHabitacion;
        this.estado = estado;
        this.numeroNoches = numeroNoches;
        this.precioPorNoche = precioPorNoche;
    }
    public double calcularTotal() {
        return numeroNoches * precioPorNoche;
    }

    public void confirmarReserva() {
        if (estado.equalsIgnoreCase("reservado")) {
            estado = "ocupado";
            System.out.println("Reserva confirmada. Estado actual: ocupado.");
        } else {
            System.out.println("No se puede confirmar. El estado actual es: " + estado);
        }
    }

    public void finalizarReserva() {
        if (estado.equalsIgnoreCase("ocupado") || estado.equalsIgnoreCase("reservado")) {
            estado = "finalizado";
            System.out.println("Reserva finalizada con exito.");
        } else {
            System.out.println("La reserva ya se encuentra finalizada.");
        }
    }

    public void mostrarReserva() {
        System.out.println("--- DATOS DE LA RESERVA DE HOTEL ---");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Tipo de Habitacion: " + tipoHabitacion);
        System.out.println("Numero de Noches: " + numeroNoches);
        System.out.println("Precio por Noche: $" + precioPorNoche);
        System.out.println("Total a Pagar: $" + calcularTotal());
        System.out.println("Estado: " + estado);
    }
}

