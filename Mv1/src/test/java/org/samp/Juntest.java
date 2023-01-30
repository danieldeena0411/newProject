package org.samp;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


//Way 1
//@RunWith(Suite.class)
//@SuiteClasses({Jun.class, Jun1.class , Jun2.class})
public class Juntest {
	
	@Test
	
	public void tcase() {
		
		Result r = JUnitCore.runClasses(Jun.class, Jun1.class , Jun2.class);
		
		System.out.println("Test Case Run Count: "+r.getRunCount());
		System.out.println("Test Case Run Time:"+r.getRunTime());
		System.out.println("Test Case Failed Count:"+r.getFailureCount());
		System.out.println(("Test Case Ignored Count:"+r.getIgnoreCount()));
		
		List<Failure> failures = r.getFailures();
		for (Failure f : failures) {
			
			System.out.println(f);
			
		}
	}
	

}
