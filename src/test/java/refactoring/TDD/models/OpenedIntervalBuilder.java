package refactoring.TDD.models;

import refactoring.TDD.models.OpenedInterval;

public class OpenedIntervalBuilder {

	private double min;
	
	private double max;
	
	OpenedIntervalBuilder(){
		this.min = 0;
		this.max = 1;
	}
	
	OpenedIntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	OpenedIntervalBuilder max(double max) {
		this.max = max;
		return this;
	}
	
	OpenedInterval build() {
		assert min <= max;
		return new OpenedInterval(min, max);
	}

	
}