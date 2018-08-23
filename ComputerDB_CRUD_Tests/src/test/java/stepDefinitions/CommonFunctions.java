package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigFileReader;

public class CommonFunctions {
	
	//Declarations  
	static WebDriver driver;
	ConfigFileReader configFileReader;
	
	//Constructor
	public CommonFunctions(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		configFileReader= new ConfigFileReader();
	}
    //Function to open Chrome Browser and Computer DB application
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver",configFileReader.getDriverPath());
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(configFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
        //Get the application url from Config file
        driver.get(configFileReader.getApplicationUrl());
	}
	
	 //Function to close browser
	public void closeBrowser(){
		driver.close();
		driver.quit(); 
	}

}
