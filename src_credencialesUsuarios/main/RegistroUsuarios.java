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

        while (true) {
            System.out.println("Ingrese su nuevo nombre de usuario:");
            String nombreUsuario = scanner.nextLine();

            String contrasena; // Declarar la variable fuera del ciclo
            while (true) {
                System.out.println("Ingrese su contraseña: ");
                contrasena = scanner.nextLine();

                // Validar si la contraseña es débil
                if (contrasena.length() < 10) {
                    System.out.println("La contraseña es débil. Debe tener más de 10 caracteres. \n Inténtalo de nuevo.");
                } else {
                    break; // Salir del ciclo si la contraseña es válida
                }
            }

            System.out.println("Ingrese su nombre completo:");
            String nombreCompleto = scanner.nextLine();

            System.out.println("Ingrese su fecha de nacimiento (DD-MM-YYYY):");
            String fechaNacimiento = scanner.nextLine();

            // Crear un nuevo objeto Persona
            Persona nuevoUsuario = new Persona(nombreUsuario, contrasena, nombreCompleto, fechaNacimiento);
            
            // Evaluar si es mayor o menor de edad
            if (nuevoUsuario.esMayor()) {
                System.out.println("Bienvenido."+nombreUsuario + "\n Puedes entrar ");
            } else {
                System.out.println("Aun eres muy joven.");
            }

            // Agregar el nuevo usuario a la lista
            usuarios.add(nuevoUsuario);

            // Mostrar lista de usuarios registrados
            System.out.println("Lista de Usuarios registrados:");
            for (int i = 0; i < usuarios.size(); i++) {
                System.out.printf("%d- %s\n", i + 1, usuarios.get(i).getNombreUsuario());
    	        }
         
            // Para salir del ciclo principal, puedes añadir una condición
            // Por ejemplo, si la lista de usuarios tiene 10 elementos
            if (usuarios.size() >= 10) {
                System.out.println("Se ha alcanzado el límite de usuarios registrados.");
                break; // Salir del ciclo principal
            }
        
        
        }

        scanner.close();
    
	
        }
}
