package Entidades;


public class Test {
	public static void main(String []arg) {
	 Empleado EvilFelipe =new Empleado ("Evil Felipe", 31, "evilFelipe@mail.com","5522334455", "Abc123","90876538", "Bell Boy");
	 
	 EvilFelipe.mostrarInformacion();
	 
		//instancia de un cliente
		
		System.out.println();//espacio	
		System.out.println("Instancai de un cliente");
		Cliente Jesus= new Cliente ("Andrea","adssq22312",12323424.0f,"1234");
		
		Jesus.mostrarCliente();
		
		
		//Modificar un atributo
		Jesus.nombre= "Evil Andrea";
		//Jesus.setSaldo(0.00f); Modificar sin un settin (error)
		
		
		//Impresion de objetos ya modificados
		System.out.println();//Espacio intencional vacio
		Jesus.mostrarCliente();
	 
	}
}
