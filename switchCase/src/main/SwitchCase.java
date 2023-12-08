package main;

public class SwitchCase {
	public static void main(String args[]) {
		
		/* A estrutura de decisão switch - case serve para que o programa possa
		 * decidir entre vários possíveis casos depedendo de uma variavel */
	
		double num1 = 10;
		double num2 = 10;
		char operator = '+';
		
		switch (operator) {
			case '+' :
				System.out.println(num1 + num2);
				break;
			case '-' :
				System.out.println(num1 - num2);
				break;
			case '*' :
				System.out.println(num1 * num2);
				break;
			case '/' :
				System.out.println(num1 / num2);
				break;
			default :
				System.out.println("Operador invalido");
		}
		
	}
}
