package main;

public class Variables {
	
	// TIPOS PRIMITIVOS: são tipos de dados básicos que representam valores simples.
	
	/*char: representa um caractere de 8 bits, e seu valor é declarado entre aspas simples.*/
	char varCaractereA = 'a';
	char varCaractereB = 'x';
	char varCaractereC = 'z';
	
	/*byte: representa um número inteiro de 8 bits, com um intervalo de valores de -128 a 127.*/
	byte varMinorByte = -128;
	byte varMajorByte = 127;
	
	/*short: representa um número inteiro de 16 bits, com um intervalo de valores de -32768 a 32767.*/
	short varMinorShort = -32768;
	short varMajorShort = 32767;
	
	/*int: representa um número inteiro de 32 bits, 
	 *com um intervalo de valores de -2147483648 a 2147483647.*/	
	int varMinorInt = -2147483648;
	int varMajorInt = 2147483647;
	
	/*long: representa um número inteiro de 64 bits,
	 *com um intervalo de valores de -9223372036854775808 a 9223372036854775807.*/
	long varMinorLong = -9223372036854775808l;
	long varMajorLong = 9223372036854775807l;
	
	/*float: representa um número de ponto flutuante de 32 bits, 
	 *com uma precisão de 7 dígitos significativos.*/
	float numeroFlutuante = 99.99f; 
	
	/*double: representa um número de ponto flutuante de 64 bits, 
	 *com uma precisão de 15 dígitos significativos.*/
	double numeroDecimal = 2.75;
	
	/*boolean: representa um valor lógico, true ou false.*/
	boolean varVerdadeiro = true;
	boolean varFalso = false;

	//TIPOS REFERENCIADOS
	/*arrays: são tipos de dados que podem armazenar um conjunto de elementos do mesmo tipo.*/
	int[ ] varArrayInt = new int[10];

}


