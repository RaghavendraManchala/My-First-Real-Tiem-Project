package mercuryTours.StepDefinition;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mercuryTours.BaseClass.MercuryTourExcelUtility;
import mercuryTours.BaseClass.MercuryToursWrapperClass;
import mercuryTours.Pages.LoginPage;

public class InvalidLoginTC_03 extends MercuryToursWrapperClass {
	static LoginPage lpom;
	static String[] data;
	
	@Given("^the user launch the application in browser$")
	public void the_user_launch_the_application_in_browser() throws Throwable {
		launchBrowser("chrome", "http://newtours.demoaut.com/index.php");
	}

	@When("^the user Enters the Invalid username and password$")
	public void the_user_Enters_the_Invalid_username_and_password() throws Throwable {
		lpom =PageFactory.initElements(driver, LoginPage.class);
		MercuryTourExcelUtility xl = new MercuryTourExcelUtility();

		data=new String[2];
		int j=0; 
		for (int i=17;i<=18;i++) {

			data[j]=xl.readXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", i, 3); 
			System.out.println(data[j]);

			j++; }


		lpom.login(data);
	}

	@When("^click on signin button$")
	public void click_on_signin_button() throws Throwable {
		lpom.loginButon();
	}

	@Then("^I validate the outcomes of invalid login$")
	public void i_validate_the_outcomes_of_invalid_login() throws Throwable {
		String ar= lpom.invalidlogin();
		 MercuryTourExcelUtility xl = new MercuryTourExcelUtility();
			String er= xl.readXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", 17, 4);
			System.out.println(ar+"\n"+er);
			xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", ar, "Sheet1", 17,5);
			if(ar.equals(er))
			{
				System.out.println("Pass");
				xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", "pass", "Sheet1", 17,6);
			}
			else
			{
				System.out.println("Fail");
				xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", "fail", "Sheet1", 17,6);
			}
			screenShot("src\\test\\resources\\ScreenShots\\Invalidlogin.png");
			quit();
	}

}


	

