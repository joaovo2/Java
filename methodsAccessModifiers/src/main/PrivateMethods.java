package main;

public class PrivateMethods {
	
	/* Este atributo e este método só são 
	 * acessiveis aqui dentro desta classe. */
	
	private int numeroPrivado = 100;
	
	private void privateMethod() {
		System.out.println("PRIVATE METHOD " + this.numeroPrivado);
	}
	
	
	
}
