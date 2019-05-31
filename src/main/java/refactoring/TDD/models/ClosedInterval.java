package refactoring.TDD.models;

public class ClosedInterval extends OpenedInterval {

	public ClosedInterval(double min, double max) {
		super(min,max);
		this.min.close();
		this.max.close();
	}

	protected boolean isIncluded(Point point) {
		return super.isIncluded(point) || this.min.isSamePoint(point) && this.max.isSamePoint(point);
	}
	
}