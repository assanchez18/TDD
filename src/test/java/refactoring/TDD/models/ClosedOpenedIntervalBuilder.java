package refactoring.TDD.models;

public class ClosedOpenedIntervalBuilder {

	private double from;
	
	private double until;
	
	ClosedOpenedIntervalBuilder(){
		this.from = 0;
		this.until = 1;
	}
	
	ClosedOpenedIntervalBuilder min(double min) {
		this.from = min;
		return this;
	}

	ClosedOpenedIntervalBuilder max(double max) {
		this.until = max;
		return this;
	}
	
	Interval build() {
		assert from <= until;
		return new Interval(new Point(from, PointType.CLOSE), new Point(until, PointType.OPEN));
	}

	
}