package refactoring.TDD.models;

public class OpenedInterval extends Interval{
	
	final private boolean OPEN = true;
	
	public OpenedInterval(double fromPoint, double untilPoint) {
		this.fromPoint = new FromPoint(fromPoint, OPEN);
		this.untilPoint = new UntilPoint(untilPoint, OPEN);
	}

	public boolean isIntersected(OpenedInterval another) {
		return this.isIncluded(another.fromPoint) ||
			   this.isIncluded(another.untilPoint) ||
			   another.isIncluded(this.fromPoint) ||
			   this.isSameInterval(another);
	}

	
}
