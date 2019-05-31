package refactoring.TDD.models;

public abstract class Interval {
	
	protected FromPoint fromPoint;
	protected UntilPoint untilPoint;
	
	public boolean isIntersected(Interval another) {
		return this.isIncluded(another.fromPoint) ||
				   this.isIncluded(another.untilPoint) ||
				   another.isIncluded(this.fromPoint) ||
				   this.isSameInterval(another);
	}

	protected boolean isIncluded(FromPoint point) {
		return this.fromPoint.isMinor(point) && point.isMinor(this.untilPoint);
	}
	protected boolean isIncluded(UntilPoint point) {
		return this.fromPoint.isMinor(point) && point.isMinor(this.untilPoint);
	}
	
	protected boolean isSameInterval(Interval interval) {
		return this.fromPoint.isSamePoint(interval.fromPoint) && this.untilPoint.isSamePoint(interval.untilPoint);
	}
}
