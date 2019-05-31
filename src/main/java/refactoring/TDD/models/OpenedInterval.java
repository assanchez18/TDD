package refactoring.TDD.models;

public class OpenedInterval extends Interval {

	public OpenedInterval(double min, double max) {
		super(min,max);
	}

	public boolean isIntersected(Interval another) {
		return  super.isIntersected(another);
	}

}
