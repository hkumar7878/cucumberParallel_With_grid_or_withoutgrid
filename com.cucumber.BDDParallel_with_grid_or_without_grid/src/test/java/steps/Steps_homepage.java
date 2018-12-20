/*package steps;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps_homepage {


	@Before 
	public void beforeSetup()
	{
		System.out.println();
	}
	@Given("^user opens web site$")
	public void user_opens_web_site() throws Throwable {
	  System.out.println("user opens web site");
	  
	}

	@When("^user navigates to home page$")
	public void user_navigates_to_home_page() throws Throwable {
	  System.out.println("User is navigated to home page");
	   
	}

	@Then("^verify home page is displayed$")
	public void verify_home_page_is_displayed() throws Throwable {
	    System.out.println("Verify home page is displayed");
	   
	}

	@Then("^user entered \"([^\"]*)\" user name$")
	public void user_entered_valid_user_name(String Username) throws Throwable {
	    System.out.println("user entered " + Username + "  user name");
	   
	}

	@Then("^user entered \"([^\"]*)\" password$")
	public void the_user_entered_valid_password(String password) throws Throwable {
	  System.out.println("user entered " + password + " password");
	   
	}
	
	@Then("^select the gender$")
	public void select_the_gender(List<String> list) throws Throwable {
	   System.out.println("Selected gender is " + list.get(1));
	    
	}
	
	@Then("^select the age and location$")
	public void select_the_age_and_location(DataTable table) throws Throwable {
	
		 | Age        | location |
		   | Below 18   | India    |
		   | Above 20   | USA      |
		 * 
		 * 
		 * Logic behind List<Map<String,String>> data=table.asMaps(String.class, String.class);
		 * 
		 * Here above table has three rows, so 'List' is used to fetch total no. of table
		 * rows which is 3. 
		 * 
		 * And 'Map' used to fetch the value of key (here key is the column name) 
		 * So, data.get(1).get("Age"). Here's '1' in data.get(1) means the row number, it means to get value of 'Age' key (or column.) from
		 * row number 1.Mind it row index starts from 0. Here row number 1 is actually second row.
		 * 
		 * 
		 
		
		List<Map<String,String>> data=table.asMaps(String.class, String.class);
		System.out.println("user selected the AGE IS : " + data.get(1).get("Age"));
		System.out.println("user selected the LOCATION IS : " + data.get(1).get("location"));
	}


	@Then("^Select the brand and price$")
	public void select_the_brand_and_price(DataTable table) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data=table.raw();
		System.out.println("Price for adidas brand is " + data.get(1).get(1));
		System.out.println("Name of second brand is " + data.get(2).get(0));
		
		
	    
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Quiting the browser");
	}
}*/