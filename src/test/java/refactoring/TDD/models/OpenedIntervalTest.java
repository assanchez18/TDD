package refactoring.TDD.models;

import org.junit.Test;

import junit.framework.TestCase;

public class OpenedIntervalTest extends TestCase {
	
	@Test
	public void testIsNotIntersectedOnLeft() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(1).max(2).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedOnRight() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(15).max(22).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOnLeft() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(1).max(3).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsIntersectedOnRight() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(14).max(22).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsSameInterval() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(3).max(14).build();
		assertTrue(one.isIntersected(another));
	}
	

	@Test
	public void testIsIntersectedInside() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(5).max(7).build();
		assertTrue(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedOutside() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(1).max(19).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedOnLeftSameLimit() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(1).max(3).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedOnRightSameLimit() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(14).max(22).build();
		assertFalse(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedWithEmptyInterval() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(3).max(3).build();
		assertFalse(one.isIntersected(another));
	}

	@Test
	public void testIsIntersectedWithEmptyInterval() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(14).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(4).max(4).build();
		assertTrue(one.isIntersected(another));
	}
	
	@Test
	public void testIsNotIntersectedWithTwoEmptyInterval() {
		OpenedInterval one = new OpenedIntervalBuilder().min(3).max(3).build();
		OpenedInterval another = new OpenedIntervalBuilder().min(3).max(3).build();
		assertFalse(one.isIntersected(another));
	}
}
