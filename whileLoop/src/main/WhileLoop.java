package main;

public class WhileLoop {
	public static void main(String args[]) {
		/* Esta estrutura de programação de rotinas repetitivas. Onde uma mesma 
		 * tarefa pode ser repetida diversar vezes baseadas em uma condição. */
		int contador = 0;
		while (contador <= 10) {
			System.out.println("** " + contador + " **");
			contador = contador + 1;
		}
	}
}
