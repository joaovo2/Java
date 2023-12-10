package main;

public class Methods {
	
	/* Métodos em Java são pedaços de código que realizam determinada tarefa 
	 * e que são utilizados para que não seja necessário escrever diversas vezes 
	 * o mesmo bloco de código. 
	 * 
	 * Os métodos também podem receber parametros para que se comportem de 
	 * maneira personalizada em cada situação. Bem como podem ser sobrecarregados.*/
	
	/* Método 'somar' para somar apenas 2 valores, onde os valores 'x' e 'y' 
	 * são parametros para que a função funcione.*/
	 public static double somar(double x, double y) {
		return (x + y);
	}
	
	/* Caso seja necessário somar 3 números, basta sobrecarregar o método, declarando 
	 * outro método com o mesmo nome, porém com parametros diferentes. */
	public static double somar(double x, double y, double z) {
		return (x + y + z);
	}
		
}
