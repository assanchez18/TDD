package refactoring.TDD.models;

public class Interval {

	protected Point from;
	protected Point until;

	public Interval(Point from, Point until) {
		this.from = from;
		this.until = until;
	}

	public boolean isIntersected(Interval another) {
		return (this.isIncluded(another.from) ||
			   this.isIncluded(another.until) ||
			   another.isIncluded(this.from) ||
			   another.isIncluded(this.until) || 
			   this.isSameInterval(another)) &&
			   !(isEmptyInterval(another) &&
			     isEmptyInterval(this));
	}

	protected boolean isIncluded(Point point) {
		return this.from.getValue() < point.getValue() &&
		       point.getValue() < this.until.getValue() || 
			   (!this.until.isOpen() &&
			    !point.isOpen() && 
			    point.getValue() == this.until.getValue());
	}
	
	private boolean isSameInterval(Interval interval) {
		return this.from.getValue() == interval.from.getValue() &&
			   this.until.getValue() == interval.until.getValue() &&
			   !isEmptyInterval(this);
	}
	
	private boolean isEmptyInterval (Interval interval) {
		return (interval.from.getValue() == interval.until.getValue());
	}
	
}
