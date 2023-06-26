/*
 * Herencia en la POO
 *  Nos permite heredar atributos y metodos con la fianalidad  de reutilizar  codigo y generar una relacion entre clases superiores (padres) y las subclases (hijos).
 *  
 *  
 *  Superclase (Clase superior) es la clase de quien vamos a heredar (persona)
 *  Sub clase (clase hijo) es donde vamos a pomer lp que heredamos (empleado)
 *  
 *  
 *  
 *  Para Heredar, usamos una palabra reservada llamada extends.Esta palabra se coloca a lado del nombre
 * 
 * 
 * 
 * 
 * */





package Entidades;
//Se le tiene que dar la instuccion de que debe heredar

public class Empleado extends Persona {
	
	//1.Atributos o priopiedades
	public String numEmpleado;
	public String nss;
	public String puesto;

	
	
	
//	//2.Constructor con parametros (heredamos la "mitad" del constructor de persona)
public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}





//	//2.Constructor con parametros (heredamos la "mitad" del constructor de persona)
//	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
//			String puesto) {
//		super(nombre, edad, correo, telefono); //nos indica que heredamos (esto en una clase superior)
//		this.numEmpleado = numEmpleado;
//		this.nss = nss;
//		this.puesto = puesto;
//	}
//	
	
	//3. Metodo para imprimir informacion empleado
	       public void mostrarInformacion() {
	            System.out.println("Nombre: " + nombre);
	            System.out.println("Edad: " + edad);
	            System.out.println("Correo: " + correo);
	            System.out.println("Telefono: " + telefono);
	            System.out.println("Numero Empleado: " + numEmpleado);
	            System.out.println("Numero Seguro Social: " + nss);
	            System.out.println("Puesto: " + puesto);
	        }//cierre mostrarInformacin
	

	     //4. toString
	        //toString es un metodo en Java que proviene de la clase Objeto (el antecesor o precursor de todos los objetos que existen en Java). Este metodo ya se escribio, ya esta definido y nos permite mostrar la informacion del objeto en una cadena de texto. 
	        
	        @Override
	        public String toString() {
	            return "Empleado [numEmpleado=" + numEmpleado + ", nss=" + nss + ", puesto=" + puesto + ", nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + ", telefono=" + telefono + "]";
	        }

	       
	public static void main(String []arg) {

}//Cierre de mi metoos main
	} // Cierre de clss
