package refactoring.TDD.models;

public class OpenedInterval {
	protected double min;
	protected boolean minOpen;
	
	protected double max;
	protected boolean maxOpen;
	
	public OpenedInterval(double min, double max) {
		this.min = min;
		this.max = max;
		this.minOpen = true;
		this.maxOpen = true;
	}

	public boolean isIntersected(OpenedInterval another) {
		return this.isIncluded(another.min, another.minOpen) ||
			   this.isIncluded(another.max, another.maxOpen) ||
			   another.isIncluded(this.min, this.minOpen) ||
			   this.isSameInterval(another);
	}

	protected boolean isIncluded(double value, boolean valueOpen) {
		return this.min < value && value < this.max;
	}
	
	private boolean isSameInterval(OpenedInterval another) {
		return this.min == another.min && this.max == another.max;
	}
	
	
}
