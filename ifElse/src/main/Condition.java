package main;

public class Condition {
	public static void main(String args[]) {

		/* Dentro de um programa, às vezes, é necessário que ações diferentes sejam
		 * executadas de acordo com determinado evento para isso podemos usar 
		 * a sintaxe do 'if' */

		int varA = 50; 
		int varB = 55;
		int resultado = 0;		
		
		if(varA > varB) {
			resultado = varA;
			//Mostre na tela a mensagem (A variável 'a' é maior que a variável 'b') 
		} else if(varA < varB)  {
			resultado = varB;
			//Mostre na tela a mensagem (A variável 'b' é maior que a variável 'a') 
		} else {
			resultado = 0;
			//Mostre na tela a mensagem (As variaveis tem o mesmo valor) 
		}
	}
}
