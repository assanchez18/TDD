package refactoring.TDD.models;

import org.junit.Test;

import junit.framework.TestCase;

public class OpenedIntervalsWithClosedIntervals extends TestCase{
	
	@Test
	public void testIsIntersectedOverlappedOnLeft() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(2).max(7).build();
		assertTrue(one.isIntersected(another));
		Interval two = new OpenedIntervalBuilder().min(1).max(5).build();
		assertTrue(another.isIntersected(two));
	}
	
	@Test
	public void testIsIntersectedOverlappedOnRight() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(5).max(19).build();
		assertTrue(one.isIntersected(another));
		Interval two = new OpenedIntervalBuilder().min(6).max(20).build();
		assertTrue(another.isIntersected(two));
	}

	@Test
	public void testIsIntersectedInside() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(5).max(9).build();
		assertTrue(one.isIntersected(another));
		Interval two = new OpenedIntervalBuilder().min(6).max(7).build();
		assertTrue(another.isIntersected(two));
	}

	@Test
	public void testIsIntersectedOutside() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(1).max(19).build();
		assertTrue(one.isIntersected(another));
		Interval two = new OpenedIntervalBuilder().min(0).max(22).build();
		assertTrue(another.isIntersected(two));
	}
	
	@Test
	public void testIsSameInterval() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(3).max(14).build();
		assertTrue(one.isIntersected(another));
		assertTrue(another.isIntersected(one));
	}
	
	@Test
	public void testIsNotIntersectedOnRight() {
		Interval  one = new OpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(14).max(17).build();
		assertFalse(one.isIntersected(another));
		Interval two = new OpenedIntervalBuilder().min(17).max(21).build();
		assertFalse(another.isIntersected(two));
	}
	
	@Test
	public void testIsNotIntersectedOnLeft() {
		Interval one = new OpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(1).max(3).build();
		assertFalse(one.isIntersected(another));
		Interval two = new OpenedIntervalBuilder().min(-1).max(1).build();
		assertFalse(another.isIntersected(two));
	}
}
