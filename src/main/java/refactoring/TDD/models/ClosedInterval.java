package refactoring.TDD.models;

public class ClosedInterval extends OpenedInterval {

	public ClosedInterval(double from, double until) {
		super(from, until);
		this.fromOpen = false;
		this.untilOpen = false;
	}

	protected boolean isIncluded(double value, boolean valueOpen) {
		return super.isIncluded(value, valueOpen) || 
				!valueOpen && (this.from == value  || this.until == value);
	}
	
}