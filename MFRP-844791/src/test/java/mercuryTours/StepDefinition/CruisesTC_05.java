package mercuryTours.StepDefinition;

import org.openqa.selenium.By;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import mercuryTours.BaseClass.MercuryTourExcelUtility;
import mercuryTours.BaseClass.MercuryToursWrapperClass;


public class CruisesTC_05 extends MercuryToursWrapperClass{

	static String[] data;
	
	@Given("^the user launches the application in browser$")
	public void the_user_launches_the_application_in_browser() throws Throwable {
		launchBrowser("chrome", "http://newtours.demoaut.com/index.php");
	}

	@Then("^click cruises$")
	public void click_cruises() throws Throwable {
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td[2]/a")).click();
	}

	@Then("^Retrive any data from the table$")
	public void retrive_any_data_from_the_table() throws Throwable {
		
		MercuryTourExcelUtility xl=new MercuryTourExcelUtility();
		data=new String[10];
		for(int i=1;i<=4;i++)
		{
			String xpath1="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/th/table/tbody/tr[6]/td["+i+"]";
			data[i]=driver.findElement(By.xpath(xpath1)).getText();
			System.out.print(data[i]);
				xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", data[i], "Sheet1",30 ,i);
		}
	}

	@Then("^I validate$")
	public void i_validate() throws Throwable {
		MercuryTourExcelUtility xl=new MercuryTourExcelUtility();
		if(xl.readXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", 30, 1).equals("Mon"))
		{
			System.out.println("Pass");
			xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", "cruiseData Retrived", "Sheet1", 28,5);
			xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", "pass", "Sheet1", 28,6);
		}
		else
		{
			System.out.println("Fail");
			xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", "HomeTable cannot be Retrived", "Sheet1", 28,5);
			xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", "fail", "Sheet1", 28,6);
		}
		screenShot("src\\test\\resources\\ScreenShots\\cruise.png");
		quit();
	   
	}



}
