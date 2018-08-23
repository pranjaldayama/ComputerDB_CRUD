package stepDefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;

import pageObjects.ComputerDBHomePage;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class DuplicateComputersStepDef {
	
	public static WebDriver  driver;
	CommonFunctions comFuncs = new CommonFunctions(CommonFunctions.driver);
	
	@Then("^verify that user should be able to add a \"([^\"]*)\" only once$")
	public void verify_that_user_should_be_able_to_add_a_only_once(String arg1) throws Throwable {
		//Instantiate Class ComputerDBHomePage
		ComputerDBHomePage cmpHome = new ComputerDBHomePage(CommonFunctions.driver);
		cmpHome.verifyifDuplicateComputersAdded(arg1);
		//Close the browser
		comFuncs.closeBrowser();
	}

}
