package main;

public class Trumpet extends Instrument {
	
	private final String name = "trumpet";
	private final int type = 1;
	private final int idenficator  = 120934;
	
	public Trumpet() {}
	
	@Override
	protected void sound() {
		System.out.println("Pa para pa Pa para pa");
	}
	
}
