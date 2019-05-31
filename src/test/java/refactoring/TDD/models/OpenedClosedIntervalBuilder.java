package refactoring.TDD.models;

public class OpenedClosedIntervalBuilder {

	private double min;
	
	private double max;
	
	OpenedClosedIntervalBuilder(){
		this.min = 0;
		this.max = 1;
	}
	
	OpenedClosedIntervalBuilder min(double min) {
		this.min = min;
		return this;
	}

	OpenedClosedIntervalBuilder max(double max) {
		this.max = max;
		return this;
	}
	
	OpenedClosedInterval build() {
		assert min <= max;
		return new OpenedClosedInterval(min, max);
	}

	
}