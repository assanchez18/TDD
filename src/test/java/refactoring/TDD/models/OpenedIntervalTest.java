package refactoring.TDD.models;

import org.junit.Test;

import junit.framework.TestCase;

public class OpenedIntervalTest extends TestCase{
	
	@Test
	public void testIsIntersectedOverlappedOnLeft() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(1).max(7).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedInside() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(5).max(7).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOverlappedOnRight() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(5).max(19).build();
		assertTrue(one.isIntersected(another));
	}


	@Test
	public void testIsIntersectedOutside() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(1).max(19).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedOnLeft() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(1).max(3).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedOnRight() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(14).max(22).build();
		assertFalse(one.isIntersected(another));
	}
}
