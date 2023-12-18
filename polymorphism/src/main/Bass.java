package main;

public class Bass  extends Instrument {
	
	private final String name = "bass";
	private final int type = 2;
	private final int idenficator  = 1345434;
	
	public Bass() {}
	
	@Override
	protected void sound() {
		System.out.println("Bum Bum Beum");
	}
	
}
