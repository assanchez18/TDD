package refactoring.TDD.models;

public class OpenedInterval {
	
	protected Point min;
	protected Point max;
	
	public OpenedInterval(double min, double max) {
		this.min = new Point(min, true);
		this.max = new Point(max, true);
	}

	public boolean isIntersected(OpenedInterval another) {
		return this.isIncluded(another.min) ||
			   this.isIncluded(another.max) ||
			   another.isIncluded(this.min) ||
			   this.isSameInterval(another);
	}

	protected boolean isIncluded(Point value) {
		return this.min.isMinor(value) && value.isMinor(this.max);
	}
	protected boolean isSameInterval(OpenedInterval another) {
		return this.min.isSamePoint(another.min) && this.max.isSamePoint(another.max);
	}
	
	
}
