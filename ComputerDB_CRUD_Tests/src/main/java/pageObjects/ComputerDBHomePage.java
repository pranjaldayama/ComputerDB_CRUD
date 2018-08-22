package pageObjects;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ComputerDBHomePage {
	
		//Button Add new Computer on the Computer DB Home Page
		@FindBy(how = How.XPATH, using = "//a[@id='add']") 
		public WebElement btn_AddNewComputer;
		
		//Search Text Box Filter By Name on Computer DB Home Page
		@FindBy(how = How.XPATH, using = "//input[@id='searchbox']")
		public WebElement txtBox_FilterByName;
		
		//Button - Filter By Name
		@FindBy(how = How.XPATH, using = "//input[@id='searchsubmit']")
		public WebElement btn_FilterByName;
		
		//Label - Number of Computers Found
		@FindBy(how = How.XPATH, using = "/html[1]/body[1]/section[1]/h1[1]")
		public WebElement lbl_NumComputersFound;
		
		//Label - Name of Computer Found : Search 
		@FindBy(how = How.XPATH, using = "//tr//td[1]")
		public WebElement lbl_SearchComputerName;
				
		//Constructor
		WebDriver driver;
		public  ComputerDBHomePage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//Function to click on button 'Add new Computer'
		public void clickOnAddNewComputer(){
			btn_AddNewComputer.click();
		}
		
		//Function to get the initial count of Computers
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//Function to verify if the computer is found
		@SuppressWarnings("deprecation")
		public void verifyComputerSearchSuccess(String arg1){
			
			try {
				if(lbl_SearchComputerName.getText().contains(arg1)){
					Assert.assertTrue("SUCCESS on Computer Search", true);
					System.out.println("COMPUTER FOUND");
				}else{
					Assert.assertFalse("FAILURE on Computer Search", false);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
}
