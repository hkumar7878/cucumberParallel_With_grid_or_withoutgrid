package com.cucumber.parallel.google.steps;



import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;
//import com.cucumber.grid.utilities.MyScreenRecorder;
import com.cucumber.parallel.extent.ExtentManager;
import com.cucumber.parallel.extent.ExtentTestManager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSteps extends BaseSteps{
	
	
	protected Scenario scenario;
	static String scenarioName;
	static int i=0;
	@Before
	public void before(Scenario scenario) throws Exception
	{
		//MyScreenRecorder.startRecording("navigationTest");
		i=i+1;
		this.scenario=scenario;
		scenarioName=scenario.getName();
		System.out.println("SCENARIO NAME FOR TEST IS " +scenarioName );
		ExtentTestManager.startTest("Scenario No : "+i+" " + scenario.getName());
		ExtentTestManager.getTest().log(Status.INFO, "Scenario started is :-" + scenario.getName());
		
	}
	
	@After
	public void after(Scenario scenario) throws Exception
	{
		if(scenario.isFailed())
		{
			ExtentTestManager.logFail("Scenario failed");
			ExtentTestManager.addScreenShotOnFailure();
		}
		
		else
		{
			ExtentTestManager.logPass("Scenario passed");
			
		}
		ExtentManager.getReporter().flush();
		//MyScreenRecorder.stopRecording();
		quitWebDriver();
	}
	
	@Given("^launch browser '(.*?)'$")
	public void launch_browser(String bName) throws Throwable {
		
		ExtentTestManager.logInfo("Launching browser and browser is " + bName);
		startWebDriver(bName);
	   
	}


	@When("^user navigates to '(.*?)'$")
	public void user_navigates_to_http_google_com(String url) throws Throwable {
		ExtentTestManager.logInfo("Navigating the url " + url);
	  navigate(url);
	    
	}

	@Then("^user enters search term '(.*?)'$")
	public void user_enters_search_term(String serachTxt) throws Throwable {

		ExtentTestManager.logInfo("Entering the search item is :-" + serachTxt);
		getDriver().findElement(By.name("q")).sendKeys(serachTxt);
		Thread.sleep(3000);
		getDriver().findElement(By.xpath("//div[@class='sbl1']/span")).click();
		
		
	}

	/*@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		Thread.sleep(6000);
		driver.findElement(By.name("btnK")).click();
		quitWebDriver();


	}*/
}
