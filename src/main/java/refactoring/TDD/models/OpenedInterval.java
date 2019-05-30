package refactoring.TDD.models;

public class OpenedInterval extends Interval {

	public OpenedInterval(double min, double max) {
		super(min,max);
	}

	public boolean isIntersected(OpenedInterval another) {
		//TO-DO: change this to isLimit(another) || super.isIntersected(another);
		//waiting for steps
		if(isLimit(another)) {
			return false;
		}
		return super.isIntersected(another);
	}

	protected boolean isIncluded(double value) {
		return this.min <= value && value <= this.max;
	}

	private boolean isLimit(OpenedInterval another) {
		return this.min == another.max || this.max == another.min;
	}
}
