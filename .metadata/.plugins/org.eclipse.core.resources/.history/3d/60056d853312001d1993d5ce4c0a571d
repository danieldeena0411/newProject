package org.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedCase implements IRetryAnalyzer {

	int min = 0 , max = 3;
	
	public boolean retry(ITestResult result) {
		
		while (min<max) {
			
			min++;
			
			return true;  // Again it will rerun the failed test case
		}
		
		return false;  // it doesn't rerun the failed test case
	}

}
