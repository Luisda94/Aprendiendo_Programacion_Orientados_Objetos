package Principal;

import Aprendiendo_POO.TelefonoMovil;

public class main {
	//creacion de instancia(objeto ) a partir de la clase ''Aprendiendo_POO" que deberai llamarse modelo, 
	//Es decir creamos el objeto
		
	//creamoas esta clase para poder instanciar es decir para poder crear los objetos, en este caso seria los nuevos telefonos moviles.
	//Nota la clase modelo fue creada primreo
    public static void main(String[] args) {
    	
    	//Ahora vamos a crear instanciar un nuevo objeto 
    	TelefonoMovil celular1 = new TelefonoMovil("Nokia","N23",2, "azul");
    	System.out.println(celular1.getMarca());//get nos permite acceder al metodo
    	
    	//crearemos otro objeto nuevo
    	TelefonoMovil celular2 = new TelefonoMovil("Motorola","G54",3,"negro");
    //	
    	
    	
    //ahora vamos a probar el metodo set para modificar en este caso el modelo del telefono
    	celular1.setModelo("modelo N95");
    	System.out.println("mostramos la marca del celular creado :" + celular1.getModelo());
System.out.println("");
    	System.out.println(celular1);

    	System.out.println(celular2);
    }
}
