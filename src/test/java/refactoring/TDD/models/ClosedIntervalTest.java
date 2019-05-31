package refactoring.TDD.models;

import org.junit.Test;

import junit.framework.TestCase;

public class ClosedIntervalTest extends TestCase {
	
	@Test
	public void testIsNotIntersectedOnLeft() {
		ClosedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(1).max(2).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedOnRight() {
		ClosedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(15).max(22).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOnLeft() {
		ClosedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(1).max(3).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOnRight() {
		ClosedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(14).max(22).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsSameInterval() {
		ClosedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(3).max(14).build();
		assertTrue(one.isIntersected(another));
	}
	

	@Test
	public void testIsIntersectedInside() {
		ClosedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(5).max(7).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOutside() {
		ClosedInterval one = new ClosedIntervalBuilder().min(3).max(14).build();
		ClosedInterval another = new ClosedIntervalBuilder().min(1).max(19).build();
		assertTrue(one.isIntersected(another));
	}
	
}