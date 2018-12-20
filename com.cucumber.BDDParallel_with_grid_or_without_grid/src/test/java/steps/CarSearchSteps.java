/*package steps;



//import org.junit.After;
//import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;




import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class CarSearchSteps {
	
	public static WebDriver driver;
	
	@Before
	public void setUp()
	{
		//FirefoxOptions firefox_options  = new FirefoxOptions();
		//firefox_options.setCapability("marionette", true);
		System.setProperty("webdriver.chrome.driver", "D:/AndroidWebParallel0529/com.cucumber.gridpractise/Browser Exes/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	@Given("^I am on the home page of https://www\\.carsguide\\.com\\.au/ of car website$")
	public void i_am_on_the_home_page_of_https_www_carsguide_com_au_of_car_website() throws Throwable {
	    
	    System.out.println("Inside");
	    //System.setProperty("webdriver.gecko.driver", "D:/AndroidWebParallel0529/com.cucumber.gridpractise/Browser Exes/geckodriver.exe");
	    //driver= new FirefoxDriver();
		driver.get("https://www.cardekho.com/");
	}

	@When("^I move to car on buy and sale menu$")
	public void i_move_to_car_on_buy_and_sale_menu() throws Throwable {
	    WebElement buySellMenu=driver.findElement(By.xpath("//a[text()='buy + sell']"));
		Actions action = new Actions(driver);
		action.moveToElement(buySellMenu).perform();
		Thread.sleep(5000);
		
		
	    System.out.println("testing");
	    
	}

	@Then("^I Click on Search Cars$")
	public void i_Click_on_Search_Cars() throws Throwable {
	    driver.findElement(By.xpath("//a[text()='Search Cars']")).click();
	    
	}

	@Then("^I select Make as \"([^\"]*)\"$")
	public void i_select_Make_as(String arg1) throws Throwable {
	    
	    WebElement makeDropDown= driver.findElement(By.id("makes"));
		Select select=new Select(makeDropDown);
		select.selectByVisibleText("BMW");
	}

	@Then("^I select Model as \"([^\"]*)\"$")
	public void i_select_Model_as(String arg1) throws Throwable {
	    
	    
	}

	@Then("^I select Location as \"([^\"]*)\"$")
	public void i_select_Location_as(String arg1) throws Throwable {
	    
	    
	}

	@Then("^I select price as \"([^\"]*)\"$")
	public void i_select_price_as(String arg1) throws Throwable {
	    
	    
	}

	@Then("^I click on Find My Next Car button$")
	public void i_click_on_Find_My_Next_Car_button() throws Throwable {
	    
	}

	@Then("^I should see list of searched cars and page title should be \"([^\"]*)\"$")
	public void i_should_see_list_of_searched_cars_and_page_title_should_be(String arg1) throws Throwable {
	    
	    
	}

}
*/