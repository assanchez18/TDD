package refactoring.TDD.models;

public class OpenedInterval {

	private double min;
	private double max;

	public OpenedInterval(double min, double max) {
		this.min = min;
		this.max = max;
	}
	

	public boolean isIntersected(OpenedInterval another) {
		if(isLimit(another)) {
			return false;
		}
		return  this.isIncluded(another.min) ||
				this.isIncluded(another.max)||
				another.isIncluded(this.min);
	}

	private boolean isIncluded(double value) {
		return this.min <= value && value <= this.max;
	}
	
	private boolean isLimit(OpenedInterval another) {
		return this.min == another.max || this.max == another.min;
	}
}
