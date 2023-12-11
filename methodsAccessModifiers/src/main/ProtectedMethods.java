package main;

import application.App;

public class ProtectedMethods {

	private int numeroProtegido = 40;
	
	protected void protectedMethod() {
		System.out.println("PROTECTED METHOD " + this.numeroProtegido);
	}
	
}
