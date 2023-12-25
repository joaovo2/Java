package main;

public class App {

	public static void main(String[] args) {

		// Instancia da classe externa
		OuterClass out = new OuterClass();
		
		// Instancia da classe interna chamando o new dentro objeto da classe externa.
		OuterClass.InnerClass in = out.new InnerClass();
		
		// Acessando os valores de cada objeto ( externo e interno ). 
		double  result = ( out.getNumber() * in.getNumber() );
		
		System.out.println(result);
		
	}

}
