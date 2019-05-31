package refactoring.TDD.models;

public class ClosedInterval extends Interval {

	public ClosedInterval(Point from, Point until) {
		super(from, until);
	}

	protected boolean isIncluded(Point value) {
		return super.isIncluded(value) || 
			   !value.isOpen() && (this.from.getValue() == value.getValue() ||
				                   this.until.getValue() == value.getValue());
	}
	
}