package refactoring.TDD.models;

public class ClosedInterval extends Interval {

	public ClosedInterval(double min, double max) {
		this.fromPoint = new FromPoint(min,false);
		this.untilPoint = new UntilPoint(max,false);
	}

	@Override
	protected boolean isIncluded(FromPoint point) {
		return super.isIncluded(point) || this.fromPoint.isSamePoint(point) && this.untilPoint.isSamePoint(point);
	}
}