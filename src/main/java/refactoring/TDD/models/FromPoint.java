package refactoring.TDD.models;

public class FromPoint extends Point{

	public FromPoint(double value, boolean open) {
		super(value, open);
	}

	@Override
	public boolean isMinor(FromPoint point) {
		return this.value < point.value || this.isSamePoint(point);
	}

	@Override
	public boolean isMinor(UntilPoint point) {
		return this.value < point.value || this.isSamePoint(point);
	}
	
	@Override
	public boolean isSamePoint(FromPoint point) {
		return super.isSameValue(point.value);
	}
	
	@Override
	public boolean isSamePoint(UntilPoint point) {
		return !this.open && !point.open && isSameValue(point.value);
	}
}
