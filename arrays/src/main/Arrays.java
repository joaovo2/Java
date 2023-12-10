package main;

import java.util.Iterator;

public class Arrays {
	public static void main(String[] args) {
		/* Um array é uma variável de variáveis, ou seja, é um bloco de tamanho fixo
		 * que permite armazenar diversos dados do MESMO TIPO */
		
		int [] intArray = new int [5];
		int resultado = 0;
		
		intArray[0] = 5;
		intArray[1] = 2;
		intArray[2] = 2;
		intArray[3] = 1;
		intArray[4] = 10;
		
		for (int i = 0; i < intArray.length; i++) {
			resultado += intArray[i];
		}
		
		System.out.println(resultado);
		
	}
}
