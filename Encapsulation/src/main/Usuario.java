package main;

public class Usuario {
	/* Para encapsulamento é uma forma de garantir que dados confidenciais 
	 * sejam ocultados dos usuários. Para isso o padrão é declarar atributos como 
	 * 'private' e fornecer os métodos get e set para acessar e atualizar os valores. */
	
	private String name;
	private int idade;
	private double peso;
	private double altura;
	
	//Métodos get and set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}	
}
