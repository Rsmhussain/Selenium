package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.pagefactory.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.CacheLookup;

public class LoginPage 
{
	public WebDriver driver;
	
	public LoginPage(WebDriver rdriver)
	{
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="login_field")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(id="commit")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(xpath="/html/body/div[1]/header/div[2]/button/svg/path")
	@CacheLookup
	WebElement Menu;
	
	@FindBy(xpath="//button[@type='submit' and @data-ga-click='Header, sign out, icon:logout' and @style='padding-left: 2px;']")
	@CacheLookup
	WebElement btnlogout;
	
	public void setUsername(String uname)
	{
		txtusername.clear();
		txtusername.sendKeys(uname);
	}
	
	public void setPassword(String pword)
	{
		txtpassword.clear();
		txtpassword.sendKeys(pword);
	}
	
	public void loginclick()
	{
		btnlogin.click();
	}
	
	public void logoutclick()
	{
		Menu.click();
		btnlogout.click();
	}
}
