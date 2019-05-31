package refactoring.TDD.models;

import org.junit.Test;

import junit.framework.TestCase;

public class OpenedClosedIntervalTest extends TestCase {
	
	@Test
	public void testIsNotIntersectedOnLeft() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedClosedIntervalBuilder().min(1).max(3).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedOnRight() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedClosedIntervalBuilder().min(14).max(22).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOnLeft() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedClosedIntervalBuilder().min(1).max(4).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOnRight() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedClosedIntervalBuilder().min(13).max(22).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsSameInterval() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		assertTrue(one.isIntersected(another));
	}
	

	@Test
	public void testIsIntersectedInside() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedClosedIntervalBuilder().min(5).max(7).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOutside() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedClosedIntervalBuilder().min(1).max(19).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedOnLeftSameLimit() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedClosedIntervalBuilder().min(1).max(3).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedOnRightSameLimit() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedClosedIntervalBuilder().min(14).max(22).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedWithEmptyInterval() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedClosedIntervalBuilder().min(3).max(3).build();
		assertFalse(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedWithEmptyInterval() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(14).build();
		Interval another = new OpenedClosedIntervalBuilder().min(4).max(4).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedWithTwoEmptyInterval() {
		Interval one = new OpenedClosedIntervalBuilder().min(3).max(3).build();
		Interval another = new OpenedClosedIntervalBuilder().min(3).max(3).build();
		assertFalse(one.isIntersected(another));
	}
}