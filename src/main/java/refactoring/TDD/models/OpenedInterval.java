package refactoring.TDD.models;

public class OpenedInterval {
	protected double from;
	protected boolean fromOpen;
	
	protected double until;
	protected boolean untilOpen;
	public OpenedInterval(double min, double max) {
		this.from = min;
		this.until = max;
		this.fromOpen = true;
		this.untilOpen = true;
	}

	public boolean isIntersected(OpenedInterval another) {
		return this.isIncluded(another.from, another.fromOpen) ||
			   this.isIncluded(another.until, another.untilOpen) ||
			   another.isIncluded(this.from, this.fromOpen) ||
			   another.isIncluded(this.until, this.untilOpen) || 
			   this.isSameInterval(another);
	}

	protected boolean isIncluded(double value, boolean valueOpen) {
		return this.from < value && value < this.until;
	}
	
	private boolean isSameInterval(OpenedInterval another) {
		return this.from == another.from && this.until == another.until && this.from != this.until;
	}
	
	
}
