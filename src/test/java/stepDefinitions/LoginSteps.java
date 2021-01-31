package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*; // 

import pageObjects.LoginPage;
import org.junit.runner.RunWith;


public class LoginSteps 
{
	public WebDriver driver;
	public LoginPage lp;
	
	 	@Given("^User launch Github home page$")
	    public void user_launch_github_home_page() throws Throwable 
	 	{
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHEIK\\git\\Selenium\\Drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        lp = new LoginPage(driver);
	 	
	 	}

	    @When("^user opens URL \"([^\"]*)\"$")
	    public void user_opens_url_something(String url) throws Throwable 
	    {
	        driver.get(url);
	    }

	    @When("^user Enter username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	    public void user_enter_username_something_and_password_something(String usname, String psw) throws Throwable 
	    {
	    	lp.setUsername(usname);
	    	lp.setPassword(psw);
	       
	    }

	    @And("^user clicks on login$")
	    public void user_clicks_on_login() throws Throwable 
	    {
	    	lp.loginclick();
	    }
	    
	    @Then("^Page title should be \"([^\"]*)\"$")
	    public void page_title_should_be_something(String strArg1) throws Throwable 
	    {
	    	if(driver.getTitle().equals("GitHub"))
	    	{
	    		System.out.println("User Loged In Successfully");
	    	}
	    	else 
	    	{
	    		System.out.println("Invalid Credentials and something went wrong");
	    	}
	    }
	    
	    @When("^user click on logout$")
	    public void user_click_on_logout() throws Throwable 
	    {
	    	lp.logoutclick();
	    	
	    }


	    @Then("^close the browser$")
	    public void close_the_browser() throws Throwable 
	    {
	    	driver.close();

	    }

	   
	    
}
