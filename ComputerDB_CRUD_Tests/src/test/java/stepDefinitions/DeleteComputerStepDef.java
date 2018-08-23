package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.EditComputerPage;
import cucumber.api.java.en.Then;

public class DeleteComputerStepDef {
	public static WebDriver  driver;
	CommonFunctions comFuncs = new CommonFunctions(CommonFunctions.driver);
	
	@Then("^user should be able to view and click the button 'Delete this Computer'$")
	public void user_should_be_able_to_view_and_click_the_button_Delete_this_Computer() throws Throwable {
		//Instantiate class EditCOmputerPage
		EditComputerPage editComp = new EditComputerPage(CommonFunctions.driver);
		//Delete the computer added
		editComp.deleteComputer();
	}

	@Then("^user should not be able to view the \"([^\"]*)\" listed below$")
	public void user_should_not_be_able_to_view_the_listed_below(String arg1) throws Throwable {
		//Instantiate class EditCOmputerPage
		EditComputerPage editComp = new EditComputerPage(CommonFunctions.driver);
		//Verify if the computer is successfully deleted
		editComp.verifyComputerDeleted();
		//Close the Browser
		comFuncs.closeBrowser();
	}


}
