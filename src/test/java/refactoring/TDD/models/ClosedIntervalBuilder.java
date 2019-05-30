package refactoring.TDD.models;

import refactoring.TDD.models.ClosedInterval;

public class ClosedIntervalBuilder {

	private double min;
	
	private double max;
	
	public ClosedIntervalBuilder(){
		this.min = 0;
		this.max = 1;
	}
	
	ClosedIntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	ClosedIntervalBuilder max(double max) {
		this.max = max;
		return this;
	}
	
	ClosedInterval build() {
		assert min <= max;
		return new ClosedInterval(min, max);
	}

	
}