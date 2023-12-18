package main;

public class App {
	public static void main(String[] args) {
		
		Trumpet trumpet = new Trumpet();
		Bass bass = new Bass();
		Guitar guitar = new Guitar();
		
		guitar.sound();
		bass.sound();
		trumpet.sound();
		
	}
}
