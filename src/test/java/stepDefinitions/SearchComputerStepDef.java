package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.ComputerDBHomePage;

@RunWith(Cucumber.class)
public class SearchComputerStepDef {
	public static WebDriver  driver;
	CommonFunctions comFuncs = new CommonFunctions(CommonFunctions.driver);
	
	@When("^user enters \"([^\"]*)\" in the 'Filter By Computer Name' text box and clicks on button 'Filter By Name'$")
	public void user_enters_in_the_Filter_By_Computer_Name_text_box_and_clicks_on_button_Filter_By_Name(String arg1) throws Throwable {
		//Instantiate Class ComputerDBHomePage
		ComputerDBHomePage cmpHome = new ComputerDBHomePage(CommonFunctions.driver);
		cmpHome.searchComputer(arg1);
	}

	@Then("^should be able to view the \"([^\"]*)\" listed below$")
	public void should_be_able_to_view_the_listed_below(String arg1) throws Throwable {
		//Instantiate Class ComputerDBHomePage
		ComputerDBHomePage cmpHome = new ComputerDBHomePage(CommonFunctions.driver);
		//Verify if the user is able to view the computer after searching
		cmpHome.verifyComputerSearchSuccess(arg1);
		//Close the browser
		comFuncs.closeBrowser();
	}
	
	

}
