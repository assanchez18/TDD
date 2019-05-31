package refactoring.TDD.models;

public class ClosedInterval extends OpenedInterval {

	public ClosedInterval(double min, double max) {
		super(min,max);
		this.minOpen = false;
		this.maxOpen = false;
	}

	protected boolean isIncluded(double value, boolean valueOpen) {
		return super.isIncluded(value, valueOpen) || this.min == value && value == this.max;
	}
	
}