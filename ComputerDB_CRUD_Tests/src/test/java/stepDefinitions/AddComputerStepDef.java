package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import pageObjects.AddComputerPage;
import pageObjects.ComputerDBHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import stepDefinitions.CommonFunctions;


@RunWith(Cucumber.class)
public class AddComputerStepDef {
	public static WebDriver  driver;
	CommonFunctions comFuncs = new CommonFunctions(CommonFunctions.driver);
	
	@Given("^user is on Computer DB application$")
	public void user_is_on_Computer_DB_application() throws Throwable {
		//Open the browser and the Computer Database application
		comFuncs.openBrowser();
		//Instantiate Class ComputerDBHomePage
		ComputerDBHomePage cmpHome = new ComputerDBHomePage(CommonFunctions.driver);
		//Get the initial count of Computers in the Computer DB
		cmpHome.getInitialCountComputer();
	}

	@When("^user clicks on the button 'Add a new computer'$")
	public void user_clicks_on_the_button_Add_a_new_computer() throws Throwable {
		ComputerDBHomePage cmpHome = new ComputerDBHomePage(CommonFunctions.driver);
		//Click on button Add New Computer
		cmpHome.clickOnAddNewComputer();
	}

	@When("^user enters \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\" then clicks on button 'Create this Computer'$")
	public void user_enters_and_then_clicks_on_button_Create_this_Computer(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		//Instantiate Class AddComputerPage
		AddComputerPage addCmp = new AddComputerPage(CommonFunctions.driver);
		CommonFunctions.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Add new Computer
		addCmp.addNewComputer(arg1, arg2, arg3, arg4);
	}

	@Then("^verify that the new computer is added with name \"([^\"]*)\"$")
	public void verify_that_the_new_computer_is_added_with_name(String arg1) throws Throwable {
		//Instantiate Class ComputerDBHomePage
		ComputerDBHomePage cmpHome = new ComputerDBHomePage(CommonFunctions.driver);
		//cmpHome.verifyComputerCountIncreased();
		cmpHome.verifyComputerAdded(arg1);
		comFuncs.closeBrowser();
	}
	
	
	
}
