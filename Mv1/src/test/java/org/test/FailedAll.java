package org.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class FailedAll implements IAnnotationTransformer{
	
	//Failed methods came from listener tag
	
	public void transform(ITestAnnotation a, Class testClass, Constructor testConstructor, Method testMethod) {
		
	
		
	
		//which is used to get the failed test cases from listeners tag
		
		    Class<? extends IRetryAnalyzer> r= a.getRetryAnalyzerClass();
		 
		 if (r == null) {
			 
			 a.setRetryAnalyzer(FailedCase.class);
			
		}
		}
	
}



