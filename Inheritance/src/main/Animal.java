package main;

/* Esta é a superclasse (classe pai), onde todos os métodos serão criados de forma genérica, 
 * pensando futuramente na implementação da subclasse (Classe filho) 
 * Por ser uma classe abstrata só pode ser usada quando herdada por outra. */
public abstract class Animal {
	private String name;
	private String specie;
	
	public Animal(String name, String specie) {
		this.name = name;
		this.specie = specie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}
	
	/* Método abstrato para que seja implementado de forma personalizada 
	 * de acordo com cada animal. */
	protected abstract void sound();
}
