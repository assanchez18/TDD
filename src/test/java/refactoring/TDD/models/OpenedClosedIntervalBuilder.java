package refactoring.TDD.models;

public class OpenedClosedIntervalBuilder {

	private double from;
	
	private double until;
	
	OpenedClosedIntervalBuilder(){
		this.from = 0;
		this.until = 1;
	}
	
	OpenedClosedIntervalBuilder min(double min) {
		this.from = min;
		return this;
	}

	OpenedClosedIntervalBuilder max(double max) {
		this.until = max;
		return this;
	}
	
	Interval build() {
		assert from <= until;
		return new Interval(new Point(from,true), new Point(until, false));
	}

	
}