package refactoring.TDD.models;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	IntervalTest.class,
	OpenedIntervalTest.class,
	ClosedIntervalTest.class
})

public class AllTest {

}