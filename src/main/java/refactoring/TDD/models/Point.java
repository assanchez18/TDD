package refactoring.TDD.models;

public class Point {
	private double value;
	private boolean open;
	
	public Point(double value, boolean open) {
		this.value = value;
		this.open = open;
	}
	
	public boolean isMinor(Point point) {
		return this.value < point.value;
	}
	
	public boolean isSamePoint(Point point) {
		return this.value == point.value;
	}
	
	public void close() {
		this.open = false;
	}
}
