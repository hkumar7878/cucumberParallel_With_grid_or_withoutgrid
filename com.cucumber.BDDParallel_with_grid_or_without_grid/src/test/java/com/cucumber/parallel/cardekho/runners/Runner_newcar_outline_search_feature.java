package com.cucumber.parallel.cardekho.runners;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features="src/test/resources/cardekhofeatures/newcarsearchOutline.feature",
		glue="com.cucumber.parallel.newcardekho.steps"	
		)
public class Runner_newcar_outline_search_feature {
	
	@Test
	public void runCuke()
	{
		new TestNGCucumberRunner(getClass()).runCukes();
		
	}
}
