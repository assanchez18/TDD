package refactoring.TDD.models;

public class Point {

	private double value;
	private boolean open;
	
	public Point(double value, boolean open) {
		this.value = value;
		this.open = open;
	}

	public double getValue() {
		return this.value;
	}

	public boolean isOpen() {
		return this.open;
	}
	
}
