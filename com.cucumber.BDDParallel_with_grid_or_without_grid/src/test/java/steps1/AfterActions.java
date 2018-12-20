/*package steps1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import utils.SeleniumDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterActions {
	
	@After
	public static void tearDown(Scenario scenario)
	{
		
		WebDriver driver=SeleniumDriver.getDriver();
    	System.out.println(scenario.isFailed());
    	 if (scenario.isFailed()) {
             byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshotBytes, "image/png");
          
         }
    	 System.out.println("INSIDE AFTER GLOABL HOOK AND QUITING THE BROWSRE");
		SeleniumDriver.tearDown();
	}

}
*/