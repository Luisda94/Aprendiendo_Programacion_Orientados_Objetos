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

        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;//formado que piden es DD/MM/AAAA
    
    if(!validarContrasenia(contrasena)) {
    	throw new IllegalArgumentException("La contraseña es debil");
    }
    	this.contrasena = contrasena;
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
    ///Para validar que la contraseña tenga al menos 2 letras mayusculas y 3 caracteres que pueden ser numeros o simbolos hare lo siguiente:
    public boolean validarContrasenia(String contrasena) {
        if (contrasena.length() < 10) {
            return false; // La contraseña no tiene más de 10 caracteres
        }
    	int contadorMayusculas = 0;
    	int contadorDeSimbolosNumeros =0;
    	
    	for (char caracter : contrasena.toCharArray()){
    		//Aqui verifico si el caracter es Mayusculas
    		if (Character.isUpperCase(caracter)) {
    			contadorMayusculas++;
    		} //Ahora verifico Contador numerico y simbolico.
    		else if (Character.isDigit(caracter) || !Character.isLetter(caracter)) {
    			contadorDeSimbolosNumeros++;
    		} 
    	}
		return contadorMayusculas >1 && contadorDeSimbolosNumeros >=3;
    	
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

