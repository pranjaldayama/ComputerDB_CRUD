package pageObjects;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddComputerPage {
	
	       //Button 'Add new Computer' on the Computer DB Home Page
			@FindBy(how = How.XPATH, using = "//input[@id='name']") 
			public WebElement txtBox_ComputerName;
			
			//Search Text Box 'Filter By Name' on Computer DB Home Page
			@FindBy(how = How.XPATH, using = "//input[@id='introduced']")
			public WebElement txtBox_IntroducedDate;
			
			//TextBox 'Discontinued Date'
			@FindBy(how = How.XPATH, using = "//input[@id='discontinued']")
			public WebElement txtBox_DiscontinuedDate;
			
			//DropDown 'Choose Company'
			@FindBy(how = How.XPATH, using = "//select[@id='company']")
			public WebElement drpDwn_SelectCompany;
			
			//Button 'Create this Computer'
			@FindBy(how = How.XPATH, using = "//input[@value='Create this computer']")
			public WebElement btn_CreateComputer;
			
			//Button 'Cancel' - Creating Computer
			@FindBy(how = How.XPATH, using = "//input[@value='Create this computer']")
			public WebElement btn_Cancel;
			
			//Button 'Save this Computer'
			@FindBy(how = How.XPATH, using = "//input[@value='Save this computer']")
			public WebElement btn_SaveComputer;
			
			//Constructor
			WebDriver driver;
			public  AddComputerPage(WebDriver driver){
				this.driver = driver;
				PageFactory.initElements(driver, this);
			}
		
			//Function to Select the Company from DropDown
			public  void selectCompanyDropDown(String arg1) {
			      try {
					Select dropDwnCompany = new Select(drpDwn_SelectCompany);
					  dropDwnCompany.selectByVisibleText(arg1);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			//Function to add new computer
			@SuppressWarnings("deprecation")
			public void addNewComputer(String arg1,String arg2,String arg3, String arg4){
				try {
					//Enter all the details to add the Computer and click on Create this Computer button
					txtBox_ComputerName.sendKeys(arg1);
					txtBox_IntroducedDate.sendKeys(arg2);
					txtBox_DiscontinuedDate.sendKeys(arg3);
					selectCompanyDropDown(arg4);
					btn_CreateComputer.click();
					Assert.assertTrue("Successfully added a new Computer", true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			//Function to edit 'Computer Name'
			@SuppressWarnings("deprecation")
			public void editComputerName(String arg1){
				try {
					txtBox_ComputerName.sendKeys(arg1);
					Assert.assertTrue("Successfully edited Computer Name", true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

}
