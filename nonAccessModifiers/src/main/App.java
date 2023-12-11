package main;

public class App {

	public static void main(String[] args) {
		
		ControlClass c = new ControlClass();
		FinalClass f = new FinalClass();
		
		/* Este método vem de uma classe abstrata 
		 * que foi herdada dentro de ControlClass */
		c.abstractMethod();
		
		/* Esta metodo vem de uma classe 'final' que
		 * não pode ser herdada e está pronta para uso. */
		f.finalMethod();
		
	}

}
