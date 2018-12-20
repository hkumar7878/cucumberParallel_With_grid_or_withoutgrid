/*package steps1;

import java.util.List;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import pages.actions.Action_CarDekhoHomePage;
import pages.actions.Action_NewCarSearchPage;
import utils.SeleniumDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CarDekho_NewCarSearch {
	
	
public static WebDriver driver;
	

@Before
public static void setUp()
{
	System.out.println("testing");
	SeleniumDriver.setUpDriver();
}	

	//Action_CarDekhoHomePage obj_action_CarDekhoHomePage= new Action_CarDekhoHomePage();
	Action_CarDekhoHomePage obj_action_CarDekhoHomePage;
	Action_NewCarSearchPage obj_action_NewCarSearchPage= new Action_NewCarSearchPage();
	SeleniumDriver seleniumDriver= null;
	
	@Given("^user is on car dekho web site \"([^\"]*)\"$")
	public void user_is_on_car_dekho_web_site(String url) throws Throwable {
			//seleniumDriver= new SeleniumDriver();
			SeleniumDriver.openPage(url);
	}

	@When("^user move to the menu$")
	public void user_move_to_the_menu(List<String> menuName) throws Throwable {
		//obj_action_CarDekhoHomePage= new Action_CarDekhoHomePage();
		obj_action_CarDekhoHomePage= new Action_CarDekhoHomePage();
		obj_action_CarDekhoHomePage.moveToNewCarMenu();
	    
	}

	@When("^user click on Search new car option$")
	public void user_click_on_Search_new_car_option() throws Throwable {
		
		obj_action_CarDekhoHomePage.clickSearchNewCarLink();
	}

	@Then("^user verify search new car page is displayed$")
	public void user_verify_search_new_car_page_is_displayed() throws Throwable {
	 String title=SeleniumDriver.getDriver().getTitle();
	 if(title.contains("New Cars in India - Find New Cars"))
		 System.out.println("Search new car page is displayed");
	 else
		 System.out.println("Search new car page is NOT displayed");
	}

	@Then("^user Select budget$")
	public void user_Select_budget_as(List<String> data) throws Throwable {
		obj_action_NewCarSearchPage= new Action_NewCarSearchPage();
		String data1=data.get(0);
	  obj_action_NewCarSearchPage.selectBudget(data1);
	  
	  
	    
	}

	@Then("^user Select vehical type$")
	public void user_Select_vehical_type_as(List<String> data) throws Throwable {
		   String data1=data.get(0);
		   
		   obj_action_NewCarSearchPage.selectVehicleType(data1);
	}

	@Then("^user clicked on search button$")
	public void user_clicked_on_search_button() throws Throwable {
	  
		obj_action_NewCarSearchPage.clickSearchBtn();
	}
	
	@Then("^use see a list of searched cars$")
	public void use_see_a_list_of_searched_cars() throws Throwable {
	   
	   
	}

	@Then("^user verify the title is \"([^\"]*)\"$")
	public void user_verify_the_title_is(String expTitle) throws Throwable {
	  String actTitle= SeleniumDriver.getDriver().getTitle();
	  System.out.println("Actual search page title is--> " + actTitle);
	  Assert.assertEquals(actTitle, expTitle);
	    
	}

}
*/