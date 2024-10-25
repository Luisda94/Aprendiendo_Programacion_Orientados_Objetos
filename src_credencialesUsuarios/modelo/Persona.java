package modelo;

import java.time.Year;

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
        // Suponiendo que fechaNacimiento es un String con formato "DD-MM-YYYY"
        String[] partes = fechaNacimiento.split("-"); // Dividir la fecha
        int anioNacimiento = Integer.parseInt(partes[2]); // Obtener el año
        int anioActual = Year.now().getValue(); // Obtener el año actual
        int edad = anioActual - anioNacimiento;
        return edad >= 18;

    }
}

