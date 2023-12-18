package main;

/* Aqui temos a subclasse que vai receber todos os métodos e atributos da superclasse. */
public class Cachorro extends Animal  {
	
	/* O construtor da subclasse recebe a assinatura declarada na superclasse e implementa o seu construtor 
	 * por meio do método super() que realiza a implementação descrita na superclasse.  */
	public Cachorro(String name, String specie) {
		super(name, specie);
	}

	/* Este método foi declarado como abstrato na superclasse sem implementação  
	 * e sua implementação foi feita aqui. Para que possa ser implementada de acordo 
	 * com as parcularidades de cada animal. */
	@Override
	protected void sound() {
		System.out.println("Au Au Au");
	}
	
}
