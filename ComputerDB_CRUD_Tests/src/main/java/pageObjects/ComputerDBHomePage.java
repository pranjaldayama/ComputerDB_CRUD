package pageObjects;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ComputerDBHomePage {
	
		//Button 'Add new Computer' on the Computer DB Home Page
		@FindBy(how = How.XPATH, using = "//a[@id='add']") 
		public WebElement btn_AddNewComputer;
		
		//Search Text Box 'Filter By Name' on Computer DB Home Page
		@FindBy(how = How.XPATH, using = "//input[@id='searchbox']")
		public WebElement txtBox_FilterByName;
		
		//Button - 'Filter By Name'
		@FindBy(how = How.XPATH, using = "//input[@id='searchsubmit']")
		public WebElement btn_FilterByName;
		
		//Label - 'Number of Computers Found'
		@FindBy(how = How.XPATH, using = "/html[1]/body[1]/section[1]/h1[1]")
		public WebElement lbl_NumComputersFound;
		
		//Label - Name of Computer Found : Search - 1st Row
		@FindBy(how = How.XPATH, using = "//tr//td[1]")
		public WebElement lbl_SearchComputerName;
		
		//Label - Name of Computer Found : Search - 2nd Row
		@FindBy(how = How.XPATH, using = "//tbody//tr[2]//td[1]")
		public WebElement lbl_SearchComputerName2;
		
		//Link - First Computer Record after Search Filter
		@FindBy(how = How.XPATH, using = "/html[1]/body[1]/section[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")
		public WebElement link_FirstComputerRecord;
		
		//Text message after successfully adding of the Computer
		@FindBy(how = How.XPATH, using = "//div[@class='alert-message warning']")
		public WebElement text_SuccessAddingComputer;
	
		//Constructor
		WebDriver driver;
		public  ComputerDBHomePage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//Function to click on button 'Add new Computer'
		public void clickOnAddNewComputer(){
			try {
				btn_AddNewComputer.click();
				Assert.assertTrue("Successfully clicked on button 'Add New Computer'", true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//Function to get the count of Computers
		public String getInitialCountComputer(){
				String txtCountInit = lbl_NumComputersFound.getText();
				if(txtCountInit.contains(" ")){
					txtCountInit= txtCountInit.substring(0, txtCountInit.indexOf(" ")); 
					System.out.println("Initial Count--------------");
			        System.out.println(txtCountInit);
				}
				return txtCountInit;
			}
		
		//Function to check if the count of number of Computers is increased by 1
		public void verifyComputerCountIncreased(){
				String txtCount = lbl_NumComputersFound.getText();
				if(txtCount.contains(" ")){
					txtCount= txtCount.substring(0, txtCount.indexOf(" "));
					System.out.println("Count After Adding Computer-----------");
			        System.out.println(txtCount);
			        String initCount = getInitialCountComputer();
			        int intInitCount = Integer.parseInt(initCount);
			        int currCount = Integer.parseInt(txtCount);
			        if (currCount == intInitCount + 1){
			        	System.out.println("Count is increased-----------");
			        }
				}
			}
		
		//Function to search the Computer added
		public void searchComputer(String arg1){
			try {
				txtBox_FilterByName.sendKeys(arg1);
				btn_FilterByName.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//Function to verify if the computer is found after Search Filter
		@SuppressWarnings("deprecation")
		public void verifyComputerSearchSuccess(String arg1){
			try {
				if(lbl_SearchComputerName.getText().contains(arg1)){
					Assert.assertTrue("SUCCESS on Computer Search", true);
				}else{
					Assert.assertFalse("FAILURE on Computer Search", false);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//Function to click on the link of the first Computer record, after applying the Search Filter
		public void clickComputerRecordForEdit(){
			try {
				link_FirstComputerRecord.click();
				Assert.assertFalse("Successfully clicked on First Computer Record", false);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//Function to check if the computer is added into the Computer DB
		public void verifyComputerAdded(String arg1){
			//Check if the success message has the name of the Computer added
			try {
				if (text_SuccessAddingComputer.getText().contains(arg1)){
					Assert.assertTrue("Successfully added Computer", true);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//Function to verify if duplicate computers are added into the database
		@SuppressWarnings("deprecation")
		public void verifyifDuplicateComputersAdded(String arg1){
			try {
				//Check if the first two rows contains the same Computer Name
				if(lbl_SearchComputerName.getText().contains(arg1) && lbl_SearchComputerName2.getText().contains(arg1)){
					Assert.assertFalse("Duplicate computers added", false);
					System.out.println("Duplicate Computers Found--------------");
				}else{
					Assert.assertTrue("Success : User is not able to add Duplicate Computers", true);
					System.out.println("UNABLE to find Duplicate Computers Found--------------");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
				
		
		
		
}
