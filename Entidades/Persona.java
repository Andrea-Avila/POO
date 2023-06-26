/*
 * Notas para trabajar con POO en JAVA
 * 
 * Establecemos los pasos para trabajar con nuestras clases, definiendo el siguiente orden:
 * 
 *  - Primero nuestras propiedades o atributos usando variables de JAVA
 *  
 *  - Definimos un constructor con parametros (este constructor se define en la clase). Tambien tenemos un constructor llamado "constructor por defecto", que se define en la instancia de la clase. El inconveniente que tenemos es que solo podemos usar uno de los dos.
 *  
 *  - Por ultimo, definimos los metodos que nuestro objeto va a utilizar. Aqui utilizamos la teoria de funciones (funciones vacias, funciones que retornar un tipo de valor).
 *  
 *  
 *  
 *  Notas adicionales
 *  
 *  Sobrecarga de metodos.
 *  
 *  La finalidad de la sobrecarga de metodos es utilizar el mismo nombre del metodo (Persona) e ir variando sus parametros. Con esto evitamos usar "Persona1", "Persona2", etc. para utilizar el mismo metodo.
 *  
 *  Hay que recordar que los datos generalmente vienen del front (formulario). La sobrecarga nos ayuda en comprender distintas situaciones donde tal vez uno de los campos solicitados en el formulario no sea requerido u obligatorio de llenar. Utilizando la sobrecarga, evitamos que el dato se asigne incorrectamente (es decir, que quede como indefinido), ya que esto podria acarrear errores en la ejecucion de nuestro codigo. De preferencia, es mejor que el dato quede como nulo.  
 *  
 * 
 */




package Entidades;

public class Persona {
	//1. Propiedades o Atributos
	public String nombre;
	public int edad;
	public String correo;//Undefind
	public String telefono; //null
	
	
	//2.Constructor (con parametros
		public  Persona(String nombre, int edad,String correo,String telefono) {
			this.nombre =nombre;
			this.edad =edad;
			this.correo =correo;
			this.telefono =telefono;
		}//Cierre de constructor
	
		
		
		//Sobrecarga de metodos (Overloading) constructor con 3
		public  Persona(String nombre, int edad,String correo) {
			this.nombre =nombre;
			this.edad =edad;
			this.correo =correo;
		}//Cierre de constructor

		
		
		//Sobrecarga de metodos (Overloading) constructor con 2
	public  Persona(String nombre, int edad) {
			this.nombre =nombre;
			this.edad =edad;
		}//Cierre de constructor
	//3.Metodos
		
		public void mostrarInformacion () {
			System.out.println("Nombre: " + nombre);
			System.out.println("Edad: " + edad);
			System.out.println("Correo: " + correo);
			System.out.println("Telefono: " + telefono);
			System.out.println(">---------------------<");
			
		} //Cierre de nuestro metodo mostrarInformacion;
	
	
		//Metodo main es una funcion "Ejecutora"
		public static void main(String []arg) {
		
		//instancia de un objeto.. llamado persona
		Persona Felipe =new Persona ("Felipe", 31, "felipe.maqueda@idr.edu.mx", "5512345678");
		Felipe.mostrarInformacion();
		//Si no respetamos el umero de parametros, orden de os datos o tipo de datos, tendremos errores para instanciar nuestros objetos 
		//persona Mariana =new Persona ("Mariana@gmail.com", 19, "mariana");
		//Segundo constructor
		
		
//podemos definir primero nuestros objetos, y despues crear nuestros constructores
		
		
		
		
//
//		Persona Andrea =new Persona ("Andrea",25 , "andrea009795@gmail.com", "19364922735");
//		Andrea.mostrarInformacion();
//		Persona Claudia =new Persona ("Claudia",27, "claudia3719@gmail.com");
//		Claudia.mostrarInformacion();
//		Persona Dulce =new Persona ("Dulce", 29, "dulce134@gmail.com", "7131565695");
//		Dulce.mostrarInformacion();
//		Persona Carlos =new Persona ("Carlos", 25, "carlangas1212@gmail.com", "74487263791");
//		Carlos.mostrarInformacion();
	}
}
