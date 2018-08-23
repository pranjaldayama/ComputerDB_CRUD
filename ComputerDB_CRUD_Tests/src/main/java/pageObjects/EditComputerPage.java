package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditComputerPage {
	
	//Button Delete Computer
	@FindBy(how = How.XPATH, using = "//input[@value='Delete this computer']") 
	public WebElement btn_DeleteComputer;
	
	//Text displayed after Search: 'Nothing to Display'
	@FindBy(how = How.XPATH, using = "//em[contains(text(),'Nothing to display')]") 
	public WebElement txt_NothingToDisplay;
	
	//Constructor
	WebDriver driver;
	public  EditComputerPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Button 'Delete the Computer'
	public void deleteComputer(){
		btn_DeleteComputer.click();
	}
	
	//Verify if the computer is deleted
	public void verifyComputerDeleted(){
		if (txt_NothingToDisplay.isDisplayed()) {
			Assert.assertTrue("Successfully Deleted the Computer", true);
		}else{
			Assert.assertTrue("Failed to Delete the Computer", false);
		}
	}

}
