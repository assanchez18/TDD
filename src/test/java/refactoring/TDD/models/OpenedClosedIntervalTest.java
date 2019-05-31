package refactoring.TDD.models;

import org.junit.Test;

import junit.framework.TestCase;

public class OpenedClosedIntervalTest extends TestCase {
	
	@Test
	public void testIsNotIntersectedOnLeft() {
		OpenedClosedInterval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		OpenedClosedInterval another = new OpenedClosedIntervalBuilder().min(1).max(3).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedOnRight() {
		OpenedClosedInterval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		OpenedClosedInterval another = new OpenedClosedIntervalBuilder().min(14).max(22).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOnLeft() {
		OpenedClosedInterval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		OpenedClosedInterval another = new OpenedClosedIntervalBuilder().min(1).max(4).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOnRight() {
		OpenedClosedInterval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		OpenedClosedInterval another = new OpenedClosedIntervalBuilder().min(13).max(22).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsSameInterval() {
		OpenedClosedInterval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		OpenedClosedInterval another = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		assertTrue(one.isIntersected(another));
	}
	

	@Test
	public void testIsIntersectedInside() {
		OpenedClosedInterval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		OpenedClosedInterval another = new OpenedClosedIntervalBuilder().min(5).max(7).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOutside() {
		OpenedClosedInterval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		OpenedClosedInterval another = new OpenedClosedIntervalBuilder().min(1).max(19).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedOnLeftSameLimit() {
		OpenedClosedInterval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		OpenedClosedInterval another = new OpenedClosedIntervalBuilder().min(1).max(3).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedOnRightSameLimit() {
		OpenedClosedInterval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		OpenedClosedInterval another = new OpenedClosedIntervalBuilder().min(14).max(22).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedWithEmptyInterval() {
		OpenedClosedInterval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		OpenedClosedInterval another = new OpenedClosedIntervalBuilder().min(3).max(3).build();
		assertFalse(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedWithEmptyInterval() {
		OpenedClosedInterval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		OpenedClosedInterval another = new OpenedClosedIntervalBuilder().min(4).max(4).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedWithTwoEmptyInterval() {
		OpenedClosedInterval one = new OpenedClosedIntervalBuilder().min(3).max(3).build();
		OpenedClosedInterval another = new OpenedClosedIntervalBuilder().min(3).max(3).build();
		assertFalse(one.isIntersected(another));
	}
}
