package com.cucumber.parallel.google.runners;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(
		features="src/test/resources/GoogleFeatures/search-outline.feature",
		glue="com.cucumber.steps.google"
		
		
		)
public class Runner_searchoutline_Feature {
	
	@Test
	public void runCuke()
	{
		new TestNGCucumberRunner(getClass()).runCukes();
	}

}
