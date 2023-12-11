package main;

public class App2 {
	public static void main(String[] args) {
		//PrivateMethods pvtMet = new PrivateMethods();
		PublicMethods pubMet = new PublicMethods();
		ProtectedMethods proMet = new ProtectedMethods();
		DefaultMethods dftMet = new DefaultMethods();
		
		/* pvtMet.privateMethod(); será o unico que não estará visivel pois,  
		 * só pode ser acessado de dentro da classe*/
		
		//Método acessado, pois é publico a todos os pacotes
		pubMet.publicMethod();
		
		//Método acessado por estar no mesmo pacote 'package' que o método
		proMet.protectedMethod();
		
		//Método acessado por estar no mesmo pacote 'package' que o método
		dftMet.defaultMethod();

	}
}
