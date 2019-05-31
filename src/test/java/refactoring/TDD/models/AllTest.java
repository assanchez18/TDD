package refactoring.TDD.models;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	OpenedIntervalsWithClosedIntervals.class,
	OpenedIntervalTest.class,
	ClosedIntervalTest.class,
	OpenedClosedIntervalTest.class,
	ClosedOpenedIntervalTest.class,
	OpenedClosedIntervalsWithClosedIntervalsTest.class,
	ClosedOpenedIntervalsWithClosedIntervalsTest.class
})

public class AllTest {

}