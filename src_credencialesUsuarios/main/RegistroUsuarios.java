package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Persona;

public class RegistroUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
//se hace arrelgo para agregar usuarios se aplica Arraylist
        List<Persona> usuarios = new ArrayList<>();

        while (usuarios.size() < 10) {
            System.out.println("Ingrese su nuevo nombre de usuario:");
            String nombreUsuario = scanner.nextLine();

            System.out.println("Ingrese su contraseña:");
            String contrasena = scanner.nextLine();
            
            // Validar si la contraseña es débil
            if (contrasena.length() < 10) {
                System.out.println("La contraseña es débil. Debe tener más de 10 caracteres. Inténtalo de nuevo.");
            } else {
                break; // Salir del ciclo si la contraseña es válida
            }

            // Validaciones de la contrasena (puedes incluir tu método aquí)
            // if (!validarContrasena(contrasena)) { ... }

            System.out.println("Ingrese su nombre completo:");
            String nombreCompleto = scanner.nextLine();

            System.out.println("Ingrese su fecha de nacimiento (YYYY):");
            String fechaNacimiento = scanner.nextLine();

            // Crear un nuevo objeto Persona
            Persona nuevoUsuario = new Persona(nombreUsuario, contrasena, nombreCompleto, fechaNacimiento);
            
            // Evaluar si es mayor o menor de edad
            if (nuevoUsuario.esMayor()) {
                System.out.println("El usuario es mayor de edad.");
            } else {
                System.out.println("El usuario es menor de edad.");
            }

            // Agregar el nuevo usuario a la lista
            usuarios.add(nuevoUsuario);
            System.out.println("Usuario registrado exitosamente!");

            // Mostrar lista de usuarios registrados
            System.out.println("Usuarios registrados:");
            for (Persona usuario : usuarios) {
                System.out.println(usuario.getNombreCompleto());
            }
        }
        
        scanner.close();
    }
	

}
