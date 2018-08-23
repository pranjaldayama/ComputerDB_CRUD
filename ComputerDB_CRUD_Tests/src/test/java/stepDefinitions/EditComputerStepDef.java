package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.AddComputerPage;
import pageObjects.ComputerDBHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class EditComputerStepDef {
	
	public static WebDriver  driver;
	CommonFunctions comFuncs = new CommonFunctions(CommonFunctions.driver);
	
	@When("^user clicks on the link \"([^\"]*)\"$")
	public void user_clicks_on_the_link(String arg1) throws Throwable {
		//Instantiate ComputerDBHomePage
		ComputerDBHomePage cmpHome = new ComputerDBHomePage(CommonFunctions.driver);
		//Click on the first link of the computer record and navigate to edit page
		cmpHome.clickComputerRecordForEdit();
	}

	@Then("^user should be able to edit the details like \"([^\"]*)\" and click on button 'Save this Computer'$")
	public void user_should_be_able_to_edit_the_details_like_and_click_on_button_Save_this_Computer(String arg1) throws Throwable {
		//Instantiate class AddComputerPage
		AddComputerPage addcompuPg = new AddComputerPage(CommonFunctions.driver);
		//Edit computer Name
		addcompuPg.editComputerName(arg1);
		//Save the computer
		addcompuPg.btn_SaveComputer.click();
	}
	
	}

