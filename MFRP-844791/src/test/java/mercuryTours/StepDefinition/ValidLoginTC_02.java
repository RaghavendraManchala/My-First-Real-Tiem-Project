package mercuryTours.StepDefinition;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mercuryTours.BaseClass.MercuryTourExcelUtility;
import mercuryTours.BaseClass.MercuryToursWrapperClass;
import mercuryTours.Pages.LoginPage;

public class ValidLoginTC_02 extends MercuryToursWrapperClass{
	static LoginPage lpom;
	static String[] data;
	
	@Given("^the user launch the application$")
	public void the_user_launch_the_application() throws Throwable {
		launchBrowser("chrome", "http://newtours.demoaut.com/index.php");
	}

	@When("^the user Enters the valid username password$")
	public void the_user_Enters_the_valid_username_password() throws Throwable {
		 lpom=PageFactory.initElements(driver, LoginPage.class); 
		 MercuryTourExcelUtility xl = new MercuryTourExcelUtility();
		  
		 
		  int j=0; 
		  int m=32;
		  for (int i=0;i<=9;i++) 
		  {
			  data=new String[2]; 
			  for(int k=0;k<=1;k++) {
				  data[j]=xl.readXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", m, 3); 
				  System.out.println(data[j]);
				  j++;
				  m++;
			  }
		  lpom.login(data);
		  lpom.loginButon();
		  
		  j=0;
		  }
		 
	}

	@When("^click on signin$")
	public void click_on_signin() throws Throwable {
		System.out.println();
	}

	@Then("^I validate the outcomes of valid login$")
	public void i_validate_the_outcomes_of_valid_login() throws Throwable {
		 MercuryTourExcelUtility xl = new MercuryTourExcelUtility();
		String ar= "SIGN-OFF";
		String er= xl.readXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", 14, 4);
		System.out.println(ar+"\n"+er);
		xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", ar, "Sheet1", 14,5);
		if(ar.equals(er))
		{
			System.out.println("Pass");
			xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", "pass", "Sheet1", 14,6);
		}
		else
		{
			System.out.println("Fail");
			xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", "fail", "Sheet1", 14,6);
		}
		screenShot("src\\test\\resources\\ScreenShots\\valildLogin.png");
		quit();
	}
}
