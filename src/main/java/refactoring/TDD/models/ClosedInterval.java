package refactoring.TDD.models;

public class ClosedInterval extends OpenedInterval{

	public ClosedInterval(double min, double max) {
		super(min,max);
	}

	protected boolean isIncluded(double value) {
		return super.isIncluded(value) || this.min == value || value == this.max;
	}
	
}