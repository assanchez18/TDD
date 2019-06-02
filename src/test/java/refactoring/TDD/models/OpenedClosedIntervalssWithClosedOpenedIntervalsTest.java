package refactoring.TDD.models;

import org.junit.Test;

import junit.framework.TestCase;

public class OpenedClosedIntervalssWithClosedOpenedIntervalsTest extends TestCase {
	
	@Test
	public void testIsNotIntersectedOnLeft() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		Interval closedOpenedInterval = new ClosedOpenedIntervalBuilder().min(1).max(3).build();
		assertFalse(one.isIntersected(closedOpenedInterval));
		Interval two = new OpenedClosedIntervalBuilder().min(-1).max(0).build();
		assertFalse(closedOpenedInterval.isIntersected(two));
	}
	
	@Test
	public void testIsNotIntersectedOnRight() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		Interval closedOpenedInterval = new ClosedOpenedIntervalBuilder().min(15).max(16).build();
		assertFalse(one.isIntersected(closedOpenedInterval));
		Interval two = new OpenedClosedIntervalBuilder().min(16).max(17).build();
		assertFalse(closedOpenedInterval.isIntersected(two));
	}
	
	@Test
	public void testIsIntersectedOnLeft() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		Interval closedOpenedInterval = new ClosedOpenedIntervalBuilder().min(1).max(4).build();
		assertTrue(one.isIntersected(closedOpenedInterval));
		Interval two = new OpenedClosedIntervalBuilder().min(0).max(2).build();
		assertTrue(closedOpenedInterval.isIntersected(two));
	}
	
	@Test
	public void testIsIntersectedOnRight() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		Interval closedOpenedInterval = new ClosedOpenedIntervalBuilder().min(14).max(17).build();
		assertTrue(one.isIntersected(closedOpenedInterval));
		Interval two = new OpenedClosedIntervalBuilder().min(16).max(20).build();
		assertTrue(closedOpenedInterval.isIntersected(two));
	}
}
