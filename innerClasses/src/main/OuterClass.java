
package main;

public class OuterClass {
	
	private double number = 25;

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}
	
	class InnerClass {
		private double number = 4;

		public double getNumber() {
			return number;
		}

		public void setNumber(double number) {
			this.number = number;
		}		
	}
	
}	
