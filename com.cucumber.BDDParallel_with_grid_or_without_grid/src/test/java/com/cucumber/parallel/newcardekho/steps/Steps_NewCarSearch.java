package com.cucumber.parallel.newcardekho.steps;



import com.aventstack.extentreports.Status;
import com.cucumber.grid.pages.actions.Action_CarDekhoHomePage;
import com.cucumber.grid.pages.actions.Action_NewCarSearchPage;
import com.cucumber.parallel.baseSteps.steps.BaseSteps;
import com.cucumber.parallel.extent.ExtentManager;
import com.cucumber.parallel.extent.ExtentTestManager;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_NewCarSearch extends BaseSteps{
	
	protected Scenario scenario;
	static String scenarioName;
	static int i=0;
	Action_CarDekhoHomePage obj_action_CarDekhoHomePage;
	Action_NewCarSearchPage obj_action_NewCarSearchPage= new Action_NewCarSearchPage();
	
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
		setUpFramework();
		
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
	public void launch_browser(String browserName) throws Throwable {
	    
	    openBrowser(browserName);
	    ExtentTestManager.logInfo("Browser opened is -->" + browserName);
	}

	@When("^user navigates to URL '(.*?)'$")
	public void user_navigates_to_URL(String URL) throws Throwable {
	    getDriver().navigate().to(URL);
	    
	}

	@When("^user move to the menu$")
	public void user_move_to_the_menu(DataTable arg1) throws Throwable {
		//obj_action_CarDekhoHomePage= new Action_CarDekhoHomePage();
		//obj_action_CarDekhoHomePage.moveToNewCarMenu();
	    
	}

	@When("^user click on Search new car option$")
	public void user_click_on_Search_new_car_option() throws Throwable {
	    
	    
	}

	@Then("^user verify search new car page is displayed$")
	public void user_verify_search_new_car_page_is_displayed() throws Throwable {
	    
	    
	}

	@Then("^user Select budget$")
	public void user_Select_budget(DataTable arg1) throws Throwable {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@Then("^user Select vehical type$")
	public void user_Select_vehical_type(DataTable arg1) throws Throwable {
	    
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@Then("^user clicked on search button$")
	public void user_clicked_on_search_button() throws Throwable {
	    
	    
	}

	@Then("^use see a list of searched cars$")
	public void use_see_a_list_of_searched_cars() throws Throwable {
	    
	    
	}

	@Then("^user verify the title is \"([^\"]*)\"$")
	public void user_verify_the_title_is(String arg1) throws Throwable {
	    
	    
	}
}
