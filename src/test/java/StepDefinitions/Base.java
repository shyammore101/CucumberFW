package StepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.ToolsQALogin;

public class Base {
	protected WebDriver driver;
	protected Properties property;
	protected ToolsQALogin loginPage;
	
	protected Properties loadPropertyFile() throws IOException {
		property=new Properties();
		File fc=new File(".//TestData//TestData.properties");
		FileInputStream ft= new FileInputStream(fc);
		property.load(ft);
		return property;
		
	}
	
	protected void loadPageObjects(WebDriver driver) {
		loginPage=new ToolsQALogin(driver);
		
	}

	public void setUp() throws IOException {
		loadPropertyFile();
		driverFactory(property.getProperty("Driver"));
		loadPageObjects(driver);
		
		
	}

	private void driverFactory(String Driver) {
		if(Driver=="Chrome") {
			System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver 4");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
		}
		else if(Driver.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "Drivers//geckodriver 2");
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		
		
	}

}
