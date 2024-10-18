package Aprendiendo_POO;

//el package Aprendiendo_POO(Programacion Orientada a Objetos) funciona como una clase modelo

//le colocamos un nombre bien descriptivo
public class TelefonoMovil {
	
	
	//justa abajo estamos declarando los atributos
		private String marca; 
		private String modelo;
		private int numeroCamara;
		private String color;
		//Luego abajo creamos el constructor que es un metodo para poder darle un dato por cada atributo que este en este constructor
		/**
		 * @param marca
		 * @param modelo
		 * @param numeroCamara
		 * @param color
		 */
		public TelefonoMovil(String marca, String modelo, int numeroCamara, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numeroCamara = numeroCamara;
		this.color = color;
	}
//Aqui generamos los getters y los setters para poder acceder y mutar a los atributos
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeroCamara() {
		return numeroCamara;
	}
	public void setNumeroCamara(int numeroCamara) {
		this.numeroCamara = numeroCamara;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//crearemos dos metodos nuevos encender linterna tipo void(sin retorno d evalor) y segundo metodo sera llamar.
	public void encenderLinterna() {
		System.out.println("linterna encendida ");
	}	
		//segundo metodo llamar donde se agrega el parametro contacto
		public void llamar(String contacto) {
	System.out.println("Llamando a "+ contacto);		
		}
	
	
	
//ahora sobreescribmos el metodo para poder mostrar los atributos cada vez que se llame el objeto o modifque en la calse main
	@Override
	public String toString() {
		return "TelefonoMovil [marca=" + marca + ", modelo=" + modelo + ", numeroCamara=" + numeroCamara + ", color="
				+ color + "]";
	}
}
