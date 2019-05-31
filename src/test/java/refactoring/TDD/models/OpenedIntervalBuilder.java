package refactoring.TDD.models;

import refactoring.TDD.models.Interval;

public class OpenedIntervalBuilder {

	private double from;
	
	private double until;
	
	OpenedIntervalBuilder(){
		this.from = 0;
		this.until = 1;
	}
	
	OpenedIntervalBuilder min(double min) {
		this.from = min;
		return this;
	}

	OpenedIntervalBuilder max(double max) {
		this.until = max;
		return this;
	}
	
	Interval build() {
		assert from <= until;
		return new Interval(new Point(from, PointType.OPEN), new Point(until, PointType.OPEN));
	}

	
}