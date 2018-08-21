package pageObjects;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ComputerDBPage {
	
		//Element searchQuery text box
		@FindBy(how = How.ID, using = "searchQuery") 
		public WebElement txtBx_searchQuery;
		
		//WebElement button 'Search a Branch'
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Search a Branch')]")
		public WebElement btn_SearchBranch;
		
		//WebElement label ID
		@FindBy(how = How.XPATH, using = "//th[contains(text(),'ID')]")
		public WebElement lbl_ID;
		
		//WebElement label ID
		@FindBy(how = How.ID, using = "myBranchLabel")
		public WebElement lbl_CreateEditBranch;
		
		//WebElement label Name
		@FindBy(how = How.XPATH, using = "//th[contains(text(),'Name')]")
		public WebElement lbl_Name;
		
		//WebElement label Code
		@FindBy(how = How.XPATH, using = "//th[contains(text(),'Code')]")
		public WebElement lbl_Code;
				
		//WebElement 'Create a new Branch'
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Create a new Branch')]")
		//@FindBy(how = How.CSS, using = "//button[class='btn btn-primary']")
		public WebElement btn_CreateBranch;

		
		//WebElment Entities on Login Page
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Entities')]")
		public WebElement btn_Entities;
		
		//WebElment Link Branch  on Login Page
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Branch')]")
		public WebElement lnk_Branch;
		
		//WebElement Pagination present on Branch Page
		@FindBy(how = How.LINK_TEXT, using = "#") 
		public WebElement icon_PaginationBranch;
		
		//WebElement input text box 'ID' on Create New Branch Pop up
		@FindBy(how = How.XPATH, using = "//input[contains(@name,'id')]")
		public WebElement txbBox_ID;
		
		//WebElement input text box 'Name' on Create New Branch Pop up
		@FindBy(how = How.XPATH, using = "//input[contains(@name,'name')]")
		public WebElement txbBox_Name;
		
		//WebElement input text box 'Code' on Create New Branch Pop up
		@FindBy(how = How.XPATH, using = "//input[contains(@name,'code')]")
		public WebElement txbBox_Code;
		
		//WebElement button Save on Create New Branch pop up
		@FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
		public WebElement btn_Save;
		
		//WebElement Button View to view the branch record added
		@FindBy(how = How.XPATH, using = "//html/body/div[3]/div[1]/div/div[4]/table/tbody/tr/td[4]/button[1]/span[2]")
		public WebElement btn_View;	
		
		//Branch View Text box read value : Name
		@FindBy(how = How.XPATH, using = "//html/body/div[3]/div[1]/div/div/table/tbody/tr[1]/td[2]/input")
		public WebElement lbl_NameValue;
		
		//Branch View Text box read value : Code
		@FindBy(how = How.XPATH, using = "//html/body/div[3]/div[1]/div/div/table/tbody/tr[2]/td[2]/input")
		public WebElement lbl_CodeValue;
				
		//Constructor
		WebDriver driver;
		public  ComputerDBPage(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		//Function to click on Entities
		public void clickOn_Entities() {
			btn_Entities.click();
		}
			
		//Function to click on Link Branch
		public void clickOn_Branch() {
			lnk_Branch.click();
		}
		
		//Function to verify all the elements present on Branch Page
		public void verify_elements_BranchPage() {
			
			if (btn_CreateBranch.isDisplayed()) {
				System.out.println("Button 'Create New Branch' is present on Branch Page");
			}
			
			if (txtBx_searchQuery.isDisplayed()) {
				System.out.println("Text Box 'Search Query' is present on Branch Page");
			}
			
			if (btn_SearchBranch.isDisplayed()) {
				System.out.println("Button 'Search a Branch' is present on Branch Page");
			}
			
			if (lbl_ID.isDisplayed()) {
				System.out.println("Label 'ID' is present on Branch Page");
			}
			
			if (lbl_Name.isDisplayed()) {
				System.out.println("Label 'Name' is present on Branch Page");
			}
			
			if (lbl_Code.isDisplayed()) {
				System.out.println("Lable 'Code' is present on Branch Page");
			}
			
			/*if(icon_PaginationBranch.isDisplayed()){
				System.out.println("Pagination is present on Branch Page");
			}*/
			
		}
		
		//Function to create a New Branch
		public void clickOnCreateNewBranch(){
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			btn_CreateBranch.click();
		}
		
		//Function to verify if the pop to create or edit a branch is opened up after clicking on button create new pop-up
		@SuppressWarnings("deprecation")
		public void verify_CreateNewBranch_Popup(){
			/*try{
				Assert.assertTrue("After click on Create New Branch, pop up opens",lbl_CreateEditBranch.isDisplayed());
			}
			catch(Exception e){
				
			}*/
		}
		
		//Function to verify if the branch record created is added to the Branches page
		public void verify_BranchRecordAdded(){
			
			
		}
		
		
}
