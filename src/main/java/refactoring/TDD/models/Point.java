package refactoring.TDD.models;

public class Point {

	private double value;
	private PointType open;
	
	public Point(double value, PointType type) {
		this.value = value;
		this.open = type;
	}

	public double getValue() {
		return this.value;
	}

	public boolean isOpen() {
		return PointType.isOpen(this.open);
	}
	
}
