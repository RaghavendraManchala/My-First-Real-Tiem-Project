package mercuryTours.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\Feature\\MercuryTours.Feature",
		plugin= {"pretty","html:Reports\\cucumberHTMLReport","json:Reports\\cucumberHTMLReport\\jsonreport",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports\\ExtentReports\\extentreport.html"},
		glue= {"mercuryTours.StepDefinition"},
		monochrome=true	
		)

public class mercuryTours_runner {

	@AfterClass
	public static void extendReport() {
		Reporter.loadXMLConfig("src\\test\\resources\\extent-config.xml");
	}
}
