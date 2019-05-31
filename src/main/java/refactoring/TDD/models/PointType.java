package refactoring.TDD.models;

public enum PointType {
OPEN,
CLOSE
;
static public boolean isOpen(PointType type) {
	return OPEN == type;
}
}
