package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsQALogin {
	
	public ToolsQALogin(WebDriver driver) {
		PageFactory.initElements(driver	, this);
	}
	
	
	public WebElement getUsrname() {
		return usrname;
	}


	@FindBy(xpath="//input[@id='username']")
	WebElement usrname;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement pwd;

	public WebElement getPwd() {
		return pwd;
	}
	
	@FindBy(xpath="//a[text()='My Account']")
	WebElement myAccLink;

	public WebElement getMyAccLink() {
		return myAccLink;
	}
	
	@FindBy(xpath="//a[text()='Dismiss']")
	WebElement dismiss;

	public WebElement getDismiss() {
		return dismiss;
	}
	
	@FindBy(xpath="//*[starts-with(@name, 'login')]")
	WebElement logInBtn;

	public WebElement getLogInBtn() {
		return logInBtn;
	}
	

}
