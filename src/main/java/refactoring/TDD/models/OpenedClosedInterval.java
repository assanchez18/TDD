package refactoring.TDD.models;

public class OpenedClosedInterval extends OpenedInterval{

	public OpenedClosedInterval(double from, double until) {
		super(from,until);
		this.fromOpen = true;
		this.untilOpen = false;
	}
}
