package main;

public class Instrument {
	
	private String name;
	private int type;
	private int identificator;

	public Instrument() {}

	protected void sound() {
		System.out.println("NULL");
	}
	
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getType() {
		return type;
	}

	protected void setType(int type) {
		this.type = type;
	}

	protected int getIdentificator() {
		return identificator;
	}

	protected void setIdentificator(int identificator) {
		this.identificator = identificator;
	}
	
}
