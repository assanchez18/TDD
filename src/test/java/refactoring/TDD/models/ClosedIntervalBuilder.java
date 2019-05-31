package refactoring.TDD.models;

import refactoring.TDD.models.ClosedInterval;

public class ClosedIntervalBuilder {

	private double from;
	
	private double until;
	
	public ClosedIntervalBuilder(){
		this.from = 0;
		this.until = 1;
	}
	
	ClosedIntervalBuilder min(double min) {
		this.from = min;
		return this;
	}

	ClosedIntervalBuilder max(double max) {
		this.until = max;
		return this;
	}
	
	ClosedInterval build() {
		assert from <= until;
		return new ClosedInterval(new Point(from, false), new Point(until, false));
	}

	
}