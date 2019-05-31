package refactoring.TDD.models;

public class Interval {

	protected Point from;
	protected Point until;

	public Interval(Point from, Point until) {
		this.from = from;
		this.until = until;
	}

	public boolean isIntersected(Interval another) {
		return this.isIncluded(another.from) ||
			   this.isIncluded(another.until) ||
			   another.isIncluded(this.from) ||
			   another.isIncluded(this.until) || 
			   this.isSameInterval(another);
	}

	protected boolean isIncluded(Point point) {
		return this.from.getValue() < point.getValue() &&
			   point.getValue() < this.until.getValue();
	}
	
	private boolean isSameInterval(Interval another) {
		return this.from.getValue() == another.from.getValue() &&
			   this.until.getValue() == another.until.getValue() &&
			   this.from.getValue() != this.until.getValue();
	}
	
	
}
