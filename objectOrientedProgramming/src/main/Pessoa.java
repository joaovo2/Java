package main;

/* Aqui criamos uma classe para representar genericamente uma pessoa. */
public class Pessoa {
	
	/* Os atributos, variáveis comuns, são as caracteristicas que 
	 * toda pessoa pode ter. Exemplo: */
	String nome;
	int idade;
	double peso;
	double altura;
	String nacionalidade;
	
	/* Os métodos, blocos de códigos pré programados, são os comportamentos que 
	 * toda pessoa pode ter. Exemplo: */
	
	/* Método construtor é um método com o mesmo nome da classe e serve para 
	 * instanciar o objeto a partir da classe para que, de fato, esses métodos e atributos 
	 * possam ser utilizados.*/
	Pessoa(String nome, int idade, double peso, double altura, String nacionalidade){
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.nacionalidade = nacionalidade;
	}
	
	/* Métodos definidos pelo programador */
	void cumprimentar(String nome) {
		System.out.println("Olá, " + nome);
	}
	
	void despedir(String nome) {
		System.out.println("Adeus " + nome);
	}
	
}