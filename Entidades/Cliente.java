package Entidades;

public class Cliente {

	//	1. Atributos
		public String nombre;
		private String CuentBancaria;
		private float saldo;
		private String nip;
	
	
	//	2. Constructor
		public Cliente(String nombre, String cuentBancaria, float saldo, String nip) {
			this.nombre = nombre;
			CuentBancaria = cuentBancaria;
			this.saldo = saldo;
			this.nip = nip;
		} //Cierre de constructor
		
		
		
		//	3. Metodos
		public void mostrarCliente() {
			System.out.println("El nombre es: " + nombre);
			System.out.println("La cuenta bancaria es: " + CuentBancaria);
			System.out.println("Su saldo actual es: " + saldo);
			System.out.println("Su nip es: " + nip);
		
		}//Cierre de mostrar infor


//Getter y Setter
		public String getCuentBancaria() { //Sirve para consultar informacion
			return CuentBancaria; //Regresa el valor de cuentaBancaria
		}



		public void setCuentBancaria(String cuentBancaria) { //Sirve para modifica la informacion
			CuentBancaria = cuentBancaria; //Le asgna el valor 
		}
		
		
		
		
		
}// Cierre de mi clase cliente


/*
 * Encapsulamiento(1 d elos 4 pilares de la POO)
 * 
 * 
 * 
 * Tiene que ver con la forma en como ocultamos algunos detalles de nuestra clase(atributos y metodos). La gran ventaja de hacer esto es que podemos proteger los datos y el comportamiento de una clase.Cuando utilizamos los modificadores de acceso, podemos controlar la forma en como se accede a los datos y como interactuamos con ellos. 
 * 
 * 
 * 
 * 
 * Modificadores de acceso
 * 
 * -public
 * -private
 * -protected
 * -default(sin modificador de acceso)
 * 
 * Con esto buscanos evitar
 * 
 * 
 * -Reasignacion de valores
 * 		
 * 		 float cuenta = 157,478.75f;
 *        cuenta = 0.00f; 
 *
 * 
 * Cuando declaramos nuestros atributos como privados, se impide el acceso a esta informacion (no podremos imprimirla en consola, ni mucho menos modificarla).
 * 
 * 
 *  Jesus.nombre = si puedo acceder porque la informacion esta publica
 *  Jesus.saldo = no se muestra porque la informacion esta privada
 * 
 * 
 * Para solventar esto, usamos los getters y setters. El getters nos permite acceder al dato por medio de un metodo publico llamado get, y tambien podemos modificar la informacion por medio del set (metodo publico)
 * 
 * 
 * 
 * Jesus.getCuentaBancaria = si puedo acceder a la informacion
 * Jesus.setCuentaBancaria = si puedo modificar la informacion
 * 
 * 
 * 
 * Los getter y setter Son metodos publicos que le sacamos como una calca sin modificar el valor original nos da un control con que se puede acceder, que se puede cambiar y como lo vamos a cambiat
 * 
 * 
 * 
 * Ventajas del encapsulamiento
 * 
 * 
 * -Proteccion de datos: Cuando dejamos los datos en privado, se evita que se sobreescriba, que se accedan directamente a ellos y se modifiquen de manera incontrolada. 
 * 
 * control de acceso: Podemos usar validaciones o booleanos para tener acceso o no a la informacion( por ejemplo que un ADMON pueda usar un setter para modificar algun dato en especifico).
 * 
 * 
 * -Flexibilidad y mantenimiento:Podemos cambiar la implementacion interna de nuestras clases (modificar el acceso, etc),sin modificar el codifo externo que la utiliza (herencia,etc.).
 * 
 * 
- Abstraccion: El encapusulamiento nos permite ocultar los detalles internos de una clase, y nos proporciona un enfoque "mas limpio" sobre lo que hace una clase, mas no como lo hace. 
 * 
 * 
 * */
