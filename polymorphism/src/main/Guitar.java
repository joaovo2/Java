package main;

public class Guitar extends Instrument  {

	private  final String name = "guitar";
	private final int type = 2;
	private final int idenficator  = 444905;
	
	public Guitar() {	}
	
	@Override
	protected void sound() {
		System.out.println("Tam tim ti ni ni nim");
	}
	
}
