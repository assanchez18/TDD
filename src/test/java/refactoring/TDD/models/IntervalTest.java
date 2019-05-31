package refactoring.TDD.models;

import org.junit.Test;

import junit.framework.TestCase;

public class IntervalTest extends TestCase{
	
	@Test
	public void testIsIntersectedOverlappedOnLeft() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(1).max(7).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOverlappedOnRight() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(5).max(19).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedInside() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(5).max(7).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOutside() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(1).max(19).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsSameInterval() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(3).max(14).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedOnRight() {
		ClosedInterval  one = new ClosedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(14).max(17).build();
		assertFalse(one.isIntersected(another));
	}
	/*
	@Test
	public void testIsNotIntersectedOnLeft() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(1).max(3).build();
		assertFalse(one.isIntersected(another));
	}*/
}
