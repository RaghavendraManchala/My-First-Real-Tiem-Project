package mercuryTours.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	// To find WebElements
	@FindBy(name="userName")
	public WebElement email;
	
	@FindBy(name="password")
	public WebElement pwd;
	
	@FindBy(name="login")
	public WebElement login;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
	public WebElement logoff;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font")
	public WebElement invalid;
	
	public void login(String[] data){
		email.sendKeys(data[0]);	//to send EmailId
		pwd.sendKeys(data[1]);}		//to send Password
	
	public void loginButon() throws InterruptedException{
		Thread.sleep(3000);
		login.click();				//to click Login Button
		logoff.click();				//to click sign off Button
		} 
	
	//to check Valid login
	public String logoff() {
		String str=logoff.getText();
		return str;
		
	}
	
	//To check in invalid Login
	public String invalidlogin() {
		String str=invalid.getText();
		return str;
		
	}
	


}
