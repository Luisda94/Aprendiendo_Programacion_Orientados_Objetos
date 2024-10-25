package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Persona {
    private String nombreUsuario;
    private String contrasena;
    private String nombreCompleto;
    private String fechaNacimiento;

    // Constructor
    public Persona(String nombreUsuario, String contrasena, String nombreCompleto, String fechaNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;//formado que piden es DD/MM/AAAA
    }

    // Getters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
	//metodo para saber si es mayor de edad. //se hace boolean por o verdad o mentira. se coloca la condicion verdadera. >=a 18
    // Método para saber si es mayor de edad
    public boolean esMayor() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimientoLocalDate;

        try {
            // Convertimos la fecha de nacimiento a LocalDate
            fechaNacimientoLocalDate = LocalDate.parse(fechaNacimiento, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha inválido. Asegúrate de usar el formato DD/MM/YYYY.");
            return false; // O lanzar una excepción según prefieras
        }

        LocalDate fechaActual = LocalDate.now(); // Fecha actual
        int edad = fechaActual.getYear() - fechaNacimientoLocalDate.getYear();

        // Ajustar la edad si el cumpleaños no ha ocurrido aún este año
        if (fechaActual.getDayOfYear() < fechaNacimientoLocalDate.getDayOfYear()) {
            edad--;
        }

        return edad >= 18;
    }
}

