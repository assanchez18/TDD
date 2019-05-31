package refactoring.TDD.models;

import org.junit.Test;

import junit.framework.TestCase;

public class ClosedOpenedIntervalsWithClosedIntervalsTest  extends TestCase {

	@Test
	public void testIsNotIntersectedOnLeft() {
		Interval one = new ClosedOpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(1).max(2).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedOnRight() {
		Interval one = new ClosedOpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(15).max(16).build();
		assertFalse(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOnLeft() {
		Interval one = new ClosedOpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(1).max(3).build();
		assertTrue(one.isIntersected(another));
		Interval two = new ClosedOpenedIntervalBuilder().min(0).max(2).build();
		assertTrue(another.isIntersected(two));
	}
	
	@Test
	public void testIsIntersectedOnRight() {
		Interval one = new ClosedOpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(13).max(22).build();
		assertTrue(one.isIntersected(another));
		Interval two = new ClosedOpenedIntervalBuilder().min(22).max(25).build();
		assertTrue(another.isIntersected(two));
	}
	
	@Test
	public void testIsSameInterval() {
		Interval one = new ClosedOpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(3).max(14).build();
		assertTrue(one.isIntersected(another));
		assertTrue(another.isIntersected(one));
	}
	

	@Test
	public void testIsIntersectedInside() {
		Interval one = new ClosedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(5).max(8).build();
		assertTrue(one.isIntersected(another));
		Interval two = new ClosedOpenedIntervalBuilder().min(6).max(7).build();
		assertTrue(another.isIntersected(two));
	}

	@Test
	public void testIsIntersectedOutside() {
		Interval one = new ClosedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(1).max(19).build();
		assertTrue(one.isIntersected(another));
		Interval two = new ClosedOpenedIntervalBuilder().min(0).max(25).build();
		assertTrue(another.isIntersected(two));
	}
}
