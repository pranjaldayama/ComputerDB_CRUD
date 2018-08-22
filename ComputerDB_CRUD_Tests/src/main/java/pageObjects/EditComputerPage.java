package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditComputerPage {
	
	//Button Add new Computer on the Computer DB Home Page
	@FindBy(how = How.XPATH, using = "/input[@value='Delete this computer']") 
	public WebElement btn_DeleteComputer;
	
	//Constructor
	WebDriver driver;
	public  EditComputerPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
