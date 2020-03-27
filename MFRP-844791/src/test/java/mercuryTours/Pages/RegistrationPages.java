package mercuryTours.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPages {
	
	//to find the WebElements in the Page
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	public WebElement register;
	
	@FindBy(name="firstName")
	public WebElement fName;
	
	@FindBy(name="lastName")
	public WebElement lName;
	
	@FindBy(name="phone")
	public WebElement phone;
	
	@FindBy(id="userName")
	public WebElement email;
	
	@FindBy(name="address1")
	public WebElement address;
	
	@FindBy(name="city")
	public WebElement city;
	
	@FindBy(name="state")
	public WebElement state;
	
	@FindBy(name="postalCode")
	public WebElement pin;
	
	@FindBy(name="country")
	public WebElement country;
	
	@FindBy(id="email")
	public WebElement id;
	
	@FindBy(name="password")
	public WebElement pwd;
	
	@FindBy(name="confirmPassword")
	public WebElement cpwd;
	
	
	@FindBy(name="register")
	public WebElement sub;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font")
	public WebElement ar;
	
	public void registerlink()
	{
		register.click(); 						//to click on register
		}
	
	//to send the details in the fields
	public void RegisterPage(String data[]){
		System.out.println(data[2]);
		fName.sendKeys(data[0]);
		lName.sendKeys(data[1]);
		phone.sendKeys(data[2]);
		email.sendKeys(data[3]);
		address.sendKeys(data[4]);
		city.sendKeys(data[5]);
		state.sendKeys(data[6]);
		pin.sendKeys(data[7]);
		Select coun = new Select(country);
		coun.selectByVisibleText(data[8]);
		id.sendKeys(data[9]);
		pwd.sendKeys(data[10]);
		cpwd.sendKeys(data[10]);
	}

		//to click Submit button
	public void submit(){
		sub.click();
		}
	
	//To get actual Result
	public String actRes(){
		String ar1=ar.getText();
		return ar1;
		}
}
