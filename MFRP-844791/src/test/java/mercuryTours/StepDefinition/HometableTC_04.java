package mercuryTours.StepDefinition;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import mercuryTours.BaseClass.MercuryTourExcelUtility;
import mercuryTours.BaseClass.MercuryToursWrapperClass;

public class HometableTC_04 extends MercuryToursWrapperClass{
	static String[][] data;
	
	@Given("^user launches the application in browser$")
	public void user_launches_the_application_in_browser() throws Throwable {
		launchBrowser("chrome", "http://newtours.demoaut.com/index.php");
	}

	@Then("^Read the Hometable$")
	public void read_the_Hometable() throws Throwable {
		data=new String[50][50];
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=2;j++){
				String xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr["+i+"]/td["+j+"]";
				data[i][j]=driver.findElement(By.xpath(xpath)).getText();
				
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
	}

	@Then("^write the table in ExcelSheey$")
	public void write_the_table_in_ExcelSheey() throws Throwable {
		MercuryTourExcelUtility xl=new MercuryTourExcelUtility();
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=2;j++){
				if( j==1)
					xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", data[i][j], "Sheet1",22+i ,0);
				else
					xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", data[i][j], "Sheet1",22+i ,1);
			}
		}
		
	}

	@Then("^I validate the outcomes of Retrived Table$")
	public void i_validate_the_outcomes_of_Retrived_Table() throws Throwable {
		MercuryTourExcelUtility xl=new MercuryTourExcelUtility();
		if(xl.readXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", 23, 0).equals("Atlanta to Las Vegas"))
		{
			System.out.println("Pass");
			xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", "HomeTable Retrived", "Sheet1", 20,5);
			xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", "pass", "Sheet1", 20,6);
		}
		else
		{
			System.out.println("Fail");
			xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", "HomeTable cannot be Retrived", "Sheet1", 20,5);
			xl.writeXL("src\\test\\resources\\TestData\\MercuryToursExcel.xlsx", "fail", "Sheet1", 20,6);
		}
		screenShot("src\\test\\resources\\ScreenShots\\Hometable.png");
		quit();
	   
	}

}
