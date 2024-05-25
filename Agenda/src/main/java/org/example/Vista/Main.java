package org.example.Vista;

import org.example.Modelo.Contacto;
import org.example.Servicio.Agenda;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Agregar contactos
        agenda.agregarContacto("Ana", 123456789, "ana@example.com", LocalDate.of(1990, 5, 15));
        agenda.agregarContacto("Beatriz", 987654321, "beatriz@example.com", LocalDate.of(1985, 8, 20));
        agenda.agregarContacto("Carlos", 456789123, "carlos@example.com", LocalDate.of(1992, 12, 10));

        // Mostrar contactos
        System.out.println("Contactos en la agenda:");
        agenda.mostrarContactos();

        // Buscar un contacto
        System.out.println("\nBuscando el contacto de Carlos:");
        Contacto contacto = agenda.buscarContacto("Carlos");
        if (contacto != null) {
            System.out.println("Nombre: " + contacto.getNombre() +
                    ", Teléfono: " + contacto.getTelefono() +
                    ", Correo Electrónico: " + contacto.getCorreoElectronico() +
                    ", Fecha de Nacimiento: " + contacto.getFechaNacimiento());
        } else {
            System.out.println("Contacto no encontrado.");
        }

        // Eliminar un contacto
        System.out.println("\nEliminando el contacto de Ana:");
        agenda.eliminarContacto("Ana");

        // Mostrar contactos después de la eliminación
        System.out.println("Contactos en la agenda después de eliminar a Ana:");
        agenda.mostrarContactos();
    }
}
