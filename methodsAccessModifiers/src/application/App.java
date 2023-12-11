package application;

import main.DefaultMethods;
import main.PrivateMethods;
import main.ProtectedMethods;
import main.PublicMethods;

public class App extends ProtectedMethods{

	public static void main (String[] args)  {
		PrivateMethods pvtMet = new PrivateMethods();
		PublicMethods pubMet = new PublicMethods();
		ProtectedMethods proMet = new ProtectedMethods();
		DefaultMethods dftMet = new DefaultMethods();
		
		/* pvtMet.privateMethod(); será o unico que não estará visivel pois,  
		 * só pode ser acessado de dentro da classe*/
		
		//Método acessado, pois é publico a todos os pacotes
		pubMet.publicMethod();
		
		//Método não acessado por estar em um pacote 'package' que o método está.
		// proMet.protectedMethod();
		
		//Método não acessado por estar em um pacote 'package' que o método está.
		// dftMet.defaultMethod();
	}

}
