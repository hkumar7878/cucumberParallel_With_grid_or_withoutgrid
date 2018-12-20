package com.cucumber.parallel.google.runners;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(
		features="src/test/resources/GoogleFeatures/search-multiple.feature",
		glue="com.cucumber.steps.google"	
		)
public class Runner_searchmultiple_Feature {
	
	@Test
	public void runCuke()
	{
		new TestNGCucumberRunner(getClass()).runCukes();
		
	}

}
