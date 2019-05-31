package refactoring.TDD.models;

public abstract class Point {
	protected double value;
	protected boolean open;
	
	public Point(double value, boolean open) {
		this.value = value;
		this.open = open;
	}
	
	public abstract boolean isMinor(FromPoint point);
	public abstract boolean isMinor(UntilPoint point);
	
	public boolean isSameValue(double value) {
		return this.value == value;
	}

	public abstract boolean isSamePoint(UntilPoint point);
	public abstract boolean isSamePoint(FromPoint point);
}
